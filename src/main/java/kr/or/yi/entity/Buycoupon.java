package kr.or.yi.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "buycoupon")
public class Buycoupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "buy_no", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "buy_product", nullable = false)
    private Product buyProduct;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_no", nullable = false)
    private User userNo;

    @Column(name = "buy_date", nullable = false)
    private Instant buyDate;

    @Column(name = "validity", nullable = false)
    private Instant validity;

    @Column(name = "use_cdt", nullable = false)
    private Integer useCdt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getBuyProduct() {
        return buyProduct;
    }

    public void setBuyProduct(Product buyProduct) {
        this.buyProduct = buyProduct;
    }

    public User getUserNo() {
        return userNo;
    }

    public void setUserNo(User userNo) {
        this.userNo = userNo;
    }

    public Instant getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Instant buyDate) {
        this.buyDate = buyDate;
    }

    public Instant getValidity() {
        return validity;
    }

    public void setValidity(Instant validity) {
        this.validity = validity;
    }

    public Integer getUseCdt() {
        return useCdt;
    }

    public void setUseCdt(Integer useCdt) {
        this.useCdt = useCdt;
    }

}