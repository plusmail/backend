package kr.or.yi.component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import kr.or.yi.entity.User;
import kr.or.yi.entity.UserRole;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class JwtManager {
    private final String securityKey = "SEYIT";
    private final Long expiredTime = 1000 * 60L * 60L * 3L;//3시간

    public String generateJwtToken(User user) {
        Date now = new Date();
        return Jwts.builder()
                .setSubject(user.getUserId())
                .setHeader(createHeader())
                .setClaims(createClaims(user))
                .setExpiration(new Date(now.getTime() + expiredTime))
                .signWith(SignatureAlgorithm.HS256, securityKey)
                .compact();
    }

    private Map<String, Object> createHeader() {
        Map<String, Object> header = new HashMap<>();
        header.put("typ", "JWT");
        header.put("alg", "HS256");
        header.put("regDate", System.currentTimeMillis());
        return header;
    }

    /*
    Claim
    @param user
    @return Map<String, Object>
     */
    private Map<String, Object> createClaims(User user) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("userId", user.getUserId());
        claims.put("roles", user.getTypes());
        return claims;
    }

    /**
     * Token 에서 Claim 을 가져온다.
     *
     * @param token JWT 토큰
     * @return Claims 클레임
     */
    private Claims getClaims(String token) {
        return Jwts.parser().setSigningKey(securityKey).parseClaimsJws(token).getBody();
    }

    public String getUserIdFromToken(String token) {
        return (String) getClaims(token).get("userId");
    }

    public Set<UserRole> getUserRoleSetFromToken(String token) {
        return (Set<UserRole>) getClaims(token).get("roles");
    }

}
