package kr.or.yi.entity;

import lombok.*;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@Table(name = "users")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_no", nullable = false)
    private Integer id;

    @Column(name = "user_id", nullable = false, length = 30)
    private String userId;

    @Column(name = "password", nullable = false, length = 30)
    private String password;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "nick", nullable = true, length = 50)
    private String nick;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "birthday", nullable = true)
    private Instant birthday;

    @Column(name = "user_join_date", nullable = true)
    private Instant userJoinDate;

    @Column(name = "user_leave_condition")
    private Integer userLeaveCondition;

    @Column(name = "point")
    private Integer point;

    @Column(name = "tel", nullable = true, length = 30)
    private String tel;

    @Column(name = "address", nullable = true)
    private String address;

    @Column(name = "detail_address")
    private String detailAddress;

    @Column(name = "email", nullable = false)
    private String email;

    public User(String userId, String email) {
        this.userId = userId;
        this.email = email;

    }

    public void changeEmail(String email){
        this.email = email;
    }

    public void changeAddress(String address){
        this.address = address;
    }

}