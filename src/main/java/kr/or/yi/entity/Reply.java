package kr.or.yi.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "reply")
public class Reply {
    @Id
    @Column(name = "comment_no", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "board_no", nullable = false)
    private Board boardNo;

    @Lob
    @Column(name = "comment_content", nullable = false)
    private String commentContent;

    @Column(name = "registration_date", nullable = false)
    private Instant registrationDate;

    @Column(name = "update_date", nullable = false)
    private Instant updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Board getBoardNo() {
        return boardNo;
    }

    public void setBoardNo(Board boardNo) {
        this.boardNo = boardNo;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Instant getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Instant registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Instant getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Instant updateDate) {
        this.updateDate = updateDate;
    }

}