package kr.or.yi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zone")
public class Zone {
    @Id
    @Column(name = "zone_no", nullable = false)
    private Integer id;

    @Column(name = "zone_name", nullable = false, length = 50)
    private String zoneName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

}