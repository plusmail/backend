package kr.or.yi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "license")
public class License {
    @Id
    @Column(name = "no", nullable = false)
    private Integer id;

    @Column(name = "owner_name", nullable = false, length = 50)
    private String ownerName;

    @Column(name = "cafe_name", nullable = false, length = 50)
    private String cafeName;

    @Column(name = "owner_no", nullable = false)
    private String ownerNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCafeName() {
        return cafeName;
    }

    public void setCafeName(String cafeName) {
        this.cafeName = cafeName;
    }

    public String getOwnerNo() {
        return ownerNo;
    }

    public void setOwnerNo(String ownerNo) {
        this.ownerNo = ownerNo;
    }

}