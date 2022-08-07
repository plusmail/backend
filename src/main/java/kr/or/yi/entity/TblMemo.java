package kr.or.yi.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_memo")
public class TblMemo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mno", nullable = false)
    private Long id;

    @Column(name = "memo_text", nullable = false, length = 200)
    private String memoText;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemoText() {
        return memoText;
    }

    public void setMemoText(String memoText) {
        this.memoText = memoText;
    }

}