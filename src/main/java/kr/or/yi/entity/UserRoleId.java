package kr.or.yi.entity;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class UserRoleId  implements Serializable {

    @ManyToOne
    @JoinColumn(name = "user_user_no")
    private User user;
    @ManyToOne
    @JoinColumn(name = "type_user_type")
    private Type type;

    public void setType(Type type) {
        this.type = type;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
