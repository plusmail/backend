package kr.or.yi.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "powerlink")
public class Powerlink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pow_no", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cafe_no", nullable = false)
    private Cafe cafeNo;

    @Column(name = "reg_date", nullable = false)
    private Instant regDate;

    @Column(name = "post_date", nullable = false)
    private Instant postDate;

    @Column(name = "pow_cdt", nullable = false)
    private Integer powCdt;

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

    public Instant getRegDate() {
        return regDate;
    }

    public void setRegDate(Instant regDate) {
        this.regDate = regDate;
    }

    public Instant getPostDate() {
        return postDate;
    }

    public void setPostDate(Instant postDate) {
        this.postDate = postDate;
    }

    public Integer getPowCdt() {
        return powCdt;
    }

    public void setPowCdt(Integer powCdt) {
        this.powCdt = powCdt;
    }

}