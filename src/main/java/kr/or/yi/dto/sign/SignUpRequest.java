package kr.or.yi.dto.sign;

import kr.or.yi.entity.Type;
import kr.or.yi.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@Data
@AllArgsConstructor
public class SignUpRequest {
    private String email;
    private String password;
    private String name;
    private String userId;

    public static User toEntity(SignUpRequest req, Type type, PasswordEncoder encoder) {
        return new User(req.email, encoder.encode(req.password), req.name, req.userId, List.of(type));
    }
}
