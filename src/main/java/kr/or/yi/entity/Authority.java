package kr.or.yi.entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "authority")
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ano_authority_no", nullable = false)
    private Integer id;

    @Column(name = "ano_authority_name", nullable = false, length = 50)
    private String anoAuthorityName;

    @OneToMany(mappedBy = "anoAuthorityNo")
    private Set<Admin> admins = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnoAuthorityName() {
        return anoAuthorityName;
    }

    public void setAnoAuthorityName(String anoAuthorityName) {
        this.anoAuthorityName = anoAuthorityName;
    }

    public Set<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(Set<Admin> admins) {
        this.admins = admins;
    }

}