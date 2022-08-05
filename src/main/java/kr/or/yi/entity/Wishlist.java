package kr.or.yi.entity;

import javax.persistence.*;

@Entity
@Table(name = "wishlist")
public class Wishlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wish_no", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cafe_no", nullable = false)
    private Cafe cafeNo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_no", nullable = false)
    private User userNo;

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

    public User getUserNo() {
        return userNo;
    }

    public void setUserNo(User userNo) {
        this.userNo = userNo;
    }

}