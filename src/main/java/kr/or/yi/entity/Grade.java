package kr.or.yi.entity;

import javax.persistence.*;

@Entity
@Table(name = "grade")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_grade", nullable = false)
    private Integer id;

    @Column(name = "user_grade_name", nullable = false, length = 50)
    private String userGradeName;

    @Column(name = "user_grade_image", nullable = false)
    private String userGradeImage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserGradeName() {
        return userGradeName;
    }

    public void setUserGradeName(String userGradeName) {
        this.userGradeName = userGradeName;
    }

    public String getUserGradeImage() {
        return userGradeImage;
    }

    public void setUserGradeImage(String userGradeImage) {
        this.userGradeImage = userGradeImage;
    }

}