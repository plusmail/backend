package kr.or.yi.entity;

import javax.persistence.*;

@Entity
@Table(name = "faqcate")
public class Faqcate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sort_no", nullable = false)
    private Integer id;

    @Column(name = "sort_name", nullable = false, length = 50)
    private String sortName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

}