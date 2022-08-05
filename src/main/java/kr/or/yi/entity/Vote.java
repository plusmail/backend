package kr.or.yi.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "vote")
public class Vote {
    @Id
    @Column(name = "vote_no", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "board_no", nullable = false)
    private Board boardNo;

    @Column(name = "vote_date", nullable = false)
    private Instant voteDate;

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

    public Instant getVoteDate() {
        return voteDate;
    }

    public void setVoteDate(Instant voteDate) {
        this.voteDate = voteDate;
    }

}