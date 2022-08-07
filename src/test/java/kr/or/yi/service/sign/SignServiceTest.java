package kr.or.yi.service.sign;

import kr.or.yi.dto.sign.SignInRequest;
import kr.or.yi.dto.sign.SignInResponse;
import kr.or.yi.dto.sign.SignUpRequest;
import kr.or.yi.entity.Type;
import kr.or.yi.entity.TypeType;
import kr.or.yi.entity.User;
import kr.or.yi.exception.*;
import kr.or.yi.repository.TypeRepository;
import kr.or.yi.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.verify;
import org.springframework.security.crypto.password.PasswordEncoder;

import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class SignServiceTest {

    @InjectMocks
    SignService signService;
    @Mock
    UserRepository userRepository;
    @Mock
    TypeRepository typeRepository;
    @Mock
    PasswordEncoder passwordEncoder;
    @Mock TokenService tokenService;

    @Test
    void signUpTest() {
        // given
        SignUpRequest req = createSignUpRequest();
        given(typeRepository.findByTypeType(TypeType.ROLE_NORMAL)).willReturn(Optional.of(new Type(TypeType.ROLE_NORMAL)));

        // when
        signService.signUp(req);

        // then
        verify(passwordEncoder).encode(req.getPassword());
        verify(userRepository).save(any());
    }

    @Test
    void validateSignUpByDuplicateEmailTest() {
        // given
        given(userRepository.existsByEmail(anyString())).willReturn(true);

        // when, then
        assertThatThrownBy(() -> signService.signUp(createSignUpRequest()))
                .isInstanceOf(UserEmailAlreadyExistsException.class);
    }

    @Test
    void validateSignUpByDuplicateNicknameTest() {
        // given
        given(userRepository.existsByUserId(anyString())).willReturn(true);

        // when, then
        assertThatThrownBy(() -> signService.signUp(createSignUpRequest()))
                .isInstanceOf(UserUserIdAlreadyExistsException.class);
    }

    @Test
    void signUpTypeNotFoundTest() {
        // given
        given(typeRepository.findByTypeType(TypeType.ROLE_NORMAL)).willReturn(Optional.empty());

        // when, then
        assertThatThrownBy(() -> signService.signUp(createSignUpRequest()))
                .isInstanceOf(TypeNotFoundException.class);
    }
//
//    @Test
//    void signInTest() {
//        // given
//        given(userRepository.findByEmail(any())).willReturn(Optional.of(createMember()));
//        given(passwordEncoder.matches(anyString(), anyString())).willReturn(true);
//        given(tokenService.createAccessToken(anyString())).willReturn("access");
//        given(tokenService.createRefreshToken(anyString())).willReturn("refresh");
//
//        // when
//        SignInResponse res = signService.signIn(new SignInRequest("email", "password"));
//
//        // then
//        assertThat(res.getAccessToken()).isEqualTo("access");
//        assertThat(res.getRefreshToken()).isEqualTo("refresh");
//    }

//    @Test
//    void signInExceptionByNoneMemberTest() {
//        // given
//        given(userRepository.findByEmail(any())).willReturn(Optional.empty());
//
//        // when, then
//        assertThatThrownBy(() -> signService.signIn(new SignInRequest("email", "password")))
//                .isInstanceOf(LoginFailureException.class);
//    }

//    @Test
//    void signInExceptionByInvalidPasswordTest() {
//        // given
//        given(userRepository.findByEmail(any())).willReturn(Optional.of(createMember()));
//        given(passwordEncoder.matches(anyString(), anyString())).willReturn(false);
//
//        // when, then
//        assertThatThrownBy(() -> signService.signIn(new SignInRequest("email", "password")))
//                .isInstanceOf(LoginFailureException.class);
//    }


    private SignUpRequest createSignUpRequest() {
        return new SignUpRequest("aaa@yi.or.kr", "aaaa", "bbbb", "xxxxx");
    }

    private User createMember() {
        return new User("aaa@yi.or.kr", "aaaa!", "bbbb", "xxxxx", emptyList());
    }

}
