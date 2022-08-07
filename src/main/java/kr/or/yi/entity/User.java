package kr.or.yi.entity;

import lombok.*;
import org.hibernate.usertype.UserType;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

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

    @Column(name = "gender", nullable = true)
    private Integer gender;

    @Column(name = "birthday", nullable = true)
    private Instant birthday;

    @Column(name = "user_join_date", nullable = true)
    private Instant userJoinDate;

    @Column(name = "user_leave_condition", nullable = true)
    private Integer userLeaveCondition;

    @Column(name = "point", nullable = true)
    private Integer point;

    @Column(name = "tel", nullable = true, length = 30)
    private String tel;

    @Column(name = "address", nullable = true)
    private String address;

    @Column(name = "detail_address", nullable = true)
    private String detailAddress;

    @Column(name = "email", nullable = false)
    private String email;

//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
//    private Set<UserRole> types;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<UserRole> types;




    public User(String userId, String email) {
        this.userId = userId;
        this.email = email;

    }
//    id, email, name, userId, userType
    public User(String email, String password,String address, String name, String userId, List<Type> types) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.userId = userId;
        this.address = address;
        this.types = types.stream().map(r -> new UserRole(this, r)).collect(toSet());
    }

    public User(String email, String encode, String name, String userId, List<Type> type) {
        this.email = email;
        this.password = encode;
        this.name = name;
        this.userId = userId;
        this.types = type.stream().map(r -> new UserRole(this, r)).collect(toSet());
    }


    public void changeEmail(String email){
        this.email = email;
    }

    public void changeAddress(String address){
        this.address = address;
    }

}