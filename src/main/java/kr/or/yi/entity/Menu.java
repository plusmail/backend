package kr.or.yi.entity;

import javax.persistence.*;

@Entity
@Table(name = "menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_no", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cafe_no", nullable = false)
    private Cafe cafeNo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "menukinds", nullable = false)
    private Menukind menukinds;

    @Column(name = "menu_name", nullable = false, length = 50)
    private String menuName;

    @Column(name = "h_i", nullable = false)
    private Integer hI;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "iced_menu_price")
    private Integer icedMenuPrice;

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

    public Menukind getMenukinds() {
        return menukinds;
    }

    public void setMenukinds(Menukind menukinds) {
        this.menukinds = menukinds;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getHI() {
        return hI;
    }

    public void setHI(Integer hI) {
        this.hI = hI;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getIcedMenuPrice() {
        return icedMenuPrice;
    }

    public void setIcedMenuPrice(Integer icedMenuPrice) {
        this.icedMenuPrice = icedMenuPrice;
    }

}