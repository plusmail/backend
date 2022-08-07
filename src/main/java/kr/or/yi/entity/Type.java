package kr.or.yi.entity;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "type")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_type", nullable = false)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_type_name", nullable = false, unique = true, length = 50)
    private TypeType userTypeName;


    public Type(TypeType typeType) {
        this.userTypeName = typeType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TypeType getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(TypeType userTypeName) {
        this.userTypeName = userTypeName;
    }

}