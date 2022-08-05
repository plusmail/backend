package kr.or.yi.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "starpoint")
public class Starpoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "star_point_no", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cafe_no", nullable = false)
    private Cafe cafeNo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "theme_no", nullable = false)
    private Theme themeNo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_no", nullable = false)
    private User userNo;

    @Column(name = "star_point", nullable = false)
    private Integer starPoint;

    @Lob
    @Column(name = "star_point_comment")
    private String starPointComment;

    @Column(name = "registration_date", nullable = false)
    private Instant registrationDate;

    @Column(name = "update_date", nullable = false)
    private Instant updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cafe getCafeNo() {
        return cafeNo;
    }

    public void setCafeNo(Cafe cafeNo) {
        this.cafeNo = cafeNo;
    }

    public Theme getThemeNo() {
        return themeNo;
    }

    public void setThemeNo(Theme themeNo) {
        this.themeNo = themeNo;
    }

    public User getUserNo() {
        return userNo;
    }

    public void setUserNo(User userNo) {
        this.userNo = userNo;
    }

    public Integer getStarPoint() {
        return starPoint;
    }

    public void setStarPoint(Integer starPoint) {
        this.starPoint = starPoint;
    }

    public String getStarPointComment() {
        return starPointComment;
    }

    public void setStarPointComment(String starPointComment) {
        this.starPointComment = starPointComment;
    }

    public Instant getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Instant registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Instant getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Instant updateDate) {
        this.updateDate = updateDate;
    }

}