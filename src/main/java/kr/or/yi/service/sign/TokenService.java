package kr.or.yi.service.sign;

import kr.or.yi.Handler.JwtHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class TokenService {

    private final JwtHandler jwtHandler;

    @Value("${jwt.max-age.access}") // 1
    private long accessTokenMaxAgeSeconds;

    @Value("${jwt.max-age.refresh}") // 2
    private long refreshTokenMaxAgeSeconds;

    @Value("${jwt.key.access}") // 3
    private String accessKey;

    @Value("${jwt.key.refresh}") // 4
    private String refreshKey;

    public String createAccessToken(String subject) {
        return jwtHandler.createToken(accessKey, subject, accessTokenMaxAgeSeconds);
    }

    public String createRefreshToken(String subject) {
        return jwtHandler.createToken(refreshKey, subject, refreshTokenMaxAgeSeconds);
    }
}
