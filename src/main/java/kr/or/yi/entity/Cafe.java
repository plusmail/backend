package kr.or.yi.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "cafe")
public class Cafe {
    @Id
    @Column(name = "cafe_no", nullable = false)
    private Integer id;

    @Column(name = "cafe_name", nullable = false, length = 100)
    private String cafeName;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "detail_address")
    private String detailAddress;

    @Column(name = "tel", length = 30)
    private String tel;

    @Column(name = "wkd_opentime", nullable = false)
    private String wkdOpentime;

    @Column(name = "wknd_opentime", nullable = false)
    private String wkndOpentime;

    @Column(name = "closed_day")
    private String closedDay;

    @Column(name = "sns")
    private String sns;

    @Column(name = "table_number")
    private Integer tableNumber;

    @Column(name = "socket_number")
    private Integer socketNumber;

    @Column(name = "toilet_cdt")
    private Integer toiletCdt;

    @Column(name = "mkdessert_cdt")
    private Integer mkdessertCdt;

    @Column(name = "terras_cdt")
    private Integer terrasCdt;

    @Column(name = "reservation_cdt")
    private Integer reservationCdt;

    @Column(name = "wondoo_buy_cdt")
    private Integer wondooBuyCdt;

    @Column(name = "book_cdt")
    private Integer bookCdt;

    @Column(name = "beer_cdt")
    private Integer beerCdt;

    @Column(name = "goods_cdt")
    private Integer goodsCdt;

    @Column(name = "wifi_cdt")
    private Integer wifiCdt;

    @Column(name = "puppy_cdt")
    private Integer puppyCdt;

    @Column(name = "reserveok_cdt")
    private Integer reserveokCdt;

    @Column(name = "parking_cdt")
    private Integer parkingCdt;

    @Column(name = "nokids_cdt")
    private Integer nokidsCdt;

    @Column(name = "registration_date", nullable = false)
    private Instant registrationDate;

    @Column(name = "update_date", nullable = false)
    private Instant updateDate;

    @Column(name = "view_number", nullable = false)
    private Integer viewNumber;

    @Lob
    @Column(name = "content")
    private String content;

    @Column(name = "oneline", nullable = false)
    private String oneline;

    @Column(name = "vote_number", nullable = false)
    private Integer voteNumber;

    @Column(name = "powerlink_cdt")
    private Integer powerlinkCdt;

    @Column(name = "cafe_cdt", nullable = false)
    private Integer cafeCdt;

    @Column(name = "owner_license_no", nullable = false)
    private String ownerLicenseNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCafeName() {
        return cafeName;
    }

    public void setCafeName(String cafeName) {
        this.cafeName = cafeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getWkdOpentime() {
        return wkdOpentime;
    }

    public void setWkdOpentime(String wkdOpentime) {
        this.wkdOpentime = wkdOpentime;
    }

    public String getWkndOpentime() {
        return wkndOpentime;
    }

    public void setWkndOpentime(String wkndOpentime) {
        this.wkndOpentime = wkndOpentime;
    }

    public String getClosedDay() {
        return closedDay;
    }

    public void setClosedDay(String closedDay) {
        this.closedDay = closedDay;
    }

    public String getSns() {
        return sns;
    }

    public void setSns(String sns) {
        this.sns = sns;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Integer getSocketNumber() {
        return socketNumber;
    }

    public void setSocketNumber(Integer socketNumber) {
        this.socketNumber = socketNumber;
    }

    public Integer getToiletCdt() {
        return toiletCdt;
    }

    public void setToiletCdt(Integer toiletCdt) {
        this.toiletCdt = toiletCdt;
    }

    public Integer getMkdessertCdt() {
        return mkdessertCdt;
    }

    public void setMkdessertCdt(Integer mkdessertCdt) {
        this.mkdessertCdt = mkdessertCdt;
    }

    public Integer getTerrasCdt() {
        return terrasCdt;
    }

    public void setTerrasCdt(Integer terrasCdt) {
        this.terrasCdt = terrasCdt;
    }

    public Integer getReservationCdt() {
        return reservationCdt;
    }

    public void setReservationCdt(Integer reservationCdt) {
        this.reservationCdt = reservationCdt;
    }

    public Integer getWondooBuyCdt() {
        return wondooBuyCdt;
    }

    public void setWondooBuyCdt(Integer wondooBuyCdt) {
        this.wondooBuyCdt = wondooBuyCdt;
    }

    public Integer getBookCdt() {
        return bookCdt;
    }

    public void setBookCdt(Integer bookCdt) {
        this.bookCdt = bookCdt;
    }

    public Integer getBeerCdt() {
        return beerCdt;
    }

    public void setBeerCdt(Integer beerCdt) {
        this.beerCdt = beerCdt;
    }

    public Integer getGoodsCdt() {
        return goodsCdt;
    }

    public void setGoodsCdt(Integer goodsCdt) {
        this.goodsCdt = goodsCdt;
    }

    public Integer getWifiCdt() {
        return wifiCdt;
    }

    public void setWifiCdt(Integer wifiCdt) {
        this.wifiCdt = wifiCdt;
    }

    public Integer getPuppyCdt() {
        return puppyCdt;
    }

    public void setPuppyCdt(Integer puppyCdt) {
        this.puppyCdt = puppyCdt;
    }

    public Integer getReserveokCdt() {
        return reserveokCdt;
    }

    public void setReserveokCdt(Integer reserveokCdt) {
        this.reserveokCdt = reserveokCdt;
    }

    public Integer getParkingCdt() {
        return parkingCdt;
    }

    public void setParkingCdt(Integer parkingCdt) {
        this.parkingCdt = parkingCdt;
    }

    public Integer getNokidsCdt() {
        return nokidsCdt;
    }

    public void setNokidsCdt(Integer nokidsCdt) {
        this.nokidsCdt = nokidsCdt;
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

    public Integer getViewNumber() {
        return viewNumber;
    }

    public void setViewNumber(Integer viewNumber) {
        this.viewNumber = viewNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOneline() {
        return oneline;
    }

    public void setOneline(String oneline) {
        this.oneline = oneline;
    }

    public Integer getVoteNumber() {
        return voteNumber;
    }

    public void setVoteNumber(Integer voteNumber) {
        this.voteNumber = voteNumber;
    }

    public Integer getPowerlinkCdt() {
        return powerlinkCdt;
    }

    public void setPowerlinkCdt(Integer powerlinkCdt) {
        this.powerlinkCdt = powerlinkCdt;
    }

    public Integer getCafeCdt() {
        return cafeCdt;
    }

    public void setCafeCdt(Integer cafeCdt) {
        this.cafeCdt = cafeCdt;
    }

    public String getOwnerLicenseNo() {
        return ownerLicenseNo;
    }

    public void setOwnerLicenseNo(String ownerLicenseNo) {
        this.ownerLicenseNo = ownerLicenseNo;
    }

}