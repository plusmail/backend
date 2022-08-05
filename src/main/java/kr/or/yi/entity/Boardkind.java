package kr.or.yi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "boardkinds")
public class Boardkind {
    @Id
    @Column(name = "board_no", nullable = false)
    private Integer id;

    @Column(name = "board_name", nullable = false, length = 50)
    private String boardName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

}