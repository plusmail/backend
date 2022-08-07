package kr.or.yi.service.sign;

import kr.or.yi.dto.sign.SignInRequest;
import kr.or.yi.dto.sign.SignInResponse;
import kr.or.yi.dto.sign.SignUpRequest;
import kr.or.yi.dto.sign.TokenService;
import kr.or.yi.entity.Type;
import kr.or.yi.entity.TypeType;
import kr.or.yi.entity.User;
import kr.or.yi.exception.*;
import kr.or.yi.exception.TypeNotPresentException;
import kr.or.yi.repository.TypeRepository;
import kr.or.yi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class SignService {
    private final UserRepository userRepository;
    private final TypeRepository typeRepository;
    private final PasswordEncoder passwordEncoder;
    private final TokenService tokenService;

    @Transactional
    public void signUp(SignUpRequest req){
        validateSignUpInfo(req);
        userRepository.save(SignUpRequest.toEntity(req,
                (Type) typeRepository.findByTypeType(TypeType.ROLE_NORMAL).orElseThrow(TypeNotFoundException::new),
                passwordEncoder));
    }

    public SignInResponse signIn(SignInRequest req) {
        User member = userRepository.findByEmail(req.getEmail());
//        User member = userRepository.findByEmail(req.getEmail()).orElseThrow(UserNotFoundException::new);
        validatePassword(req, member);
        String subject = createSubject(member);
        String accessToken = tokenService.createAccessToken(subject);
        String refreshToken = tokenService.createRefreshToken(subject);
        return new SignInResponse(accessToken, refreshToken);
    }

    private void validateSignUpInfo(SignUpRequest req) {
        if(userRepository.existsByEmail(req.getEmail()))
            throw new UserEmailAlreadyExistsException(req.getEmail());
        if(userRepository.existsByNickname(req.getUserId()))
            throw new UserUserIdAlreadyExistsException(req.getUserId());
    }

    private void validatePassword(SignInRequest req, User member) {
        if(!passwordEncoder.matches(req.getPassword(), member.getPassword())) {
            throw new LoginFailureException();
        }
    }

    private String createSubject(User member) {
        return String.valueOf(member.getId());
    }
}
