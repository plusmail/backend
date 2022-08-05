package kr.or.yi.entity;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ano_no", nullable = false)
    private Integer id;

    @Column(name = "ano_id", nullable = false, length = 30)
    private String anoId;

    @Column(name = "ano_password", nullable = false, length = 30)
    private String anoPassword;

    @Column(name = "ano_image", nullable = false)
    private String anoImage;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ano_authority_no", nullable = false)
    private Authority anoAuthorityNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnoId() {
        return anoId;
    }

    public void setAnoId(String anoId) {
        this.anoId = anoId;
    }

    public String getAnoPassword() {
        return anoPassword;
    }

    public void setAnoPassword(String anoPassword) {
        this.anoPassword = anoPassword;
    }

    public String getAnoImage() {
        return anoImage;
    }

    public void setAnoImage(String anoImage) {
        this.anoImage = anoImage;
    }

    public Authority getAnoAuthorityNo() {
        return anoAuthorityNo;
    }

    public void setAnoAuthorityNo(Authority anoAuthorityNo) {
        this.anoAuthorityNo = anoAuthorityNo;
    }

}