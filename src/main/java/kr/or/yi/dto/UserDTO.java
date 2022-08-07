package kr.or.yi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable {
    private Integer id;
    private String userId;
    private String password;
    private String name;
    private String nick;
    private Integer gender;
    private Instant birthday;
    private Instant userJoinDate;
    private Integer userLeaveCondition;
    private Integer point;
    private String tel;
    private String address;
    private String detailAddress;
    private String email;
    private Integer userType;

}
