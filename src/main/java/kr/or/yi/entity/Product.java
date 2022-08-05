package kr.or.yi.entity;

import javax.persistence.*;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_no", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_sort", nullable = false)
    private Category productSort;

    @Column(name = "product_name", nullable = false, length = 50)
    private String productName;

    @Column(name = "product_price", nullable = false)
    private Integer productPrice;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "supplier", nullable = false)
    private Supplier supplier;

    @Lob
    @Column(name = "product_content", nullable = false)
    private String productContent;

    @Column(name = "product_image", nullable = false)
    private String productImage;

    @Column(name = "valid", nullable = false)
    private Instant valid;

    @Column(name = "order_count", nullable = false)
    private Integer orderCount;

    @OneToMany(mappedBy = "buyProduct")
    private Set<Buycoupon> buycoupons = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Category getProductSort() {
        return productSort;
    }

    public void setProductSort(Category productSort) {
        this.productSort = productSort;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public String getProductContent() {
        return productContent;
    }

    public void setProductContent(String productContent) {
        this.productContent = productContent;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public Instant getValid() {
        return valid;
    }

    public void setValid(Instant valid) {
        this.valid = valid;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Set<Buycoupon> getBuycoupons() {
        return buycoupons;
    }

    public void setBuycoupons(Set<Buycoupon> buycoupons) {
        this.buycoupons = buycoupons;
    }

}