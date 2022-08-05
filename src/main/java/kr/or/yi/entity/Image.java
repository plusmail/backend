package kr.or.yi.entity;

import javax.persistence.*;

@Entity
@Table(name = "image")
public class Image {
    @Id
    @Column(name = "image_no", nullable = false)
    private Integer id;

    @Column(name = "image_name", nullable = false)
    private String imageName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_no")
    private Board boardNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Board getBoardNo() {
        return boardNo;
    }

    public void setBoardNo(Board boardNo) {
        this.boardNo = boardNo;
    }

}