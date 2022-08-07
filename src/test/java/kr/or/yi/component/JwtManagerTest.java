package kr.or.yi.component;


import kr.or.yi.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;
import lombok.extern.log4j.Log4j2;

@DisplayName("JwtManger 테스트")
@Log4j2
class JwtManagerTest {
    private JwtManager jwtManager;

    @BeforeEach
    void setUp(){
        jwtManager = new JwtManager();
    }

    @Test
    @DisplayName("토큰 생성 및 복호화 테스트 진행")
    void tokenTest(){
        LocalDateTime now = LocalDateTime.now();
        final User user = User.builder()
                .userId("onetwo1234")
                .password("Onetwo1234!")
                .name("황하나")
                .email("hothihi5@gmail.com")
                .tel("053-123-1234")
                .userLeaveCondition(1)
                .build();

        final String token = jwtManager.generateJwtToken(user);

        log.info("token :" ,token);

        String userIdFromToken = jwtManager.getUserIdFromToken(token);
        log.info("userIdFromToken :" ,userIdFromToken);


        assertEquals("onetwo1234", userIdFromToken);
    }

}
