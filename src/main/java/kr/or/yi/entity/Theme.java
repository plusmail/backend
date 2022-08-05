package kr.or.yi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "theme")
public class Theme {
    @Id
    @Column(name = "theme_no", nullable = false)
    private Integer id;

    @Column(name = "theme_name", nullable = false, length = 50)
    private String themeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getThemeName() {
        return themeName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

}