package kr.or.yi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "keywordcate")
public class Keywordcate {
    @Id
    @Column(name = "key_sort_no", nullable = false)
    private Integer id;

    @Column(name = "key_name", nullable = false, length = 50)
    private String keyName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

}