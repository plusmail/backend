package kr.or.yi.entity;

import javax.persistence.*;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

import lombok.*;


@Entity
@Builder
@Table(name = "board")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_no", nullable = false)
    private Integer id;

    @Column(name = "address")
    private String address;

    @Column(name = "board_del_cdt", nullable = false)
    private Integer boardDelCdt;

    @Column(name = "registration_date", nullable = false)
    private Instant registrationDate;

    @Column(name = "reply_cnt")
    private Integer replyCnt;

    @Column(name = "update_date", nullable = false)
    private Instant updateDate;

    @Column(name = "view_number", nullable = false)
    private Integer viewNumber;

    @Column(name = "vote_number", nullable = false)
    private Integer voteNumber;

    @Lob
    @Column(name = "writing_content")
    private String writingContent;

    @Column(name = "writing_lock_condition")
    private Integer writingLockCondition;

    @Column(name = "writing_title", nullable = false)
    private String writingTitle;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "board_no2", nullable = false)
    private Boardkind boardNo2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cafe_no")
    private Cafe cafeNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "key_sort_no")
    private Keywordcate keySortNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "theme_no")
    private Theme themeNo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_no", nullable = false)
    private User userNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "zone_no")
    private Zone zoneNo;


    @OneToMany(mappedBy = "boardNo")
    private Set<Vote> votes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "boardNo")
    private Set<Image> images = new LinkedHashSet<>();

    @OneToMany(mappedBy = "boardNo")
    private Set<Reply> replies = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getBoardDelCdt() {
        return boardDelCdt;
    }

    public void setBoardDelCdt(Integer boardDelCdt) {
        this.boardDelCdt = boardDelCdt;
    }

    public Instant getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Instant registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Integer getReplyCnt() {
        return replyCnt;
    }

    public void setReplyCnt(Integer replyCnt) {
        this.replyCnt = replyCnt;
    }

    public Instant getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Instant updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getViewNumber() {
        return viewNumber;
    }

    public void setViewNumber(Integer viewNumber) {
        this.viewNumber = viewNumber;
    }

    public Integer getVoteNumber() {
        return voteNumber;
    }

    public void setVoteNumber(Integer voteNumber) {
        this.voteNumber = voteNumber;
    }

    public String getWritingContent() {
        return writingContent;
    }

    public void setWritingContent(String writingContent) {
        this.writingContent = writingContent;
    }

    public Integer getWritingLockCondition() {
        return writingLockCondition;
    }

    public void setWritingLockCondition(Integer writingLockCondition) {
        this.writingLockCondition = writingLockCondition;
    }

    public String getWritingTitle() {
        return writingTitle;
    }

    public void setWritingTitle(String writingTitle) {
        this.writingTitle = writingTitle;
    }

    public Boardkind getBoardNo2() {
        return boardNo2;
    }

    public void setBoardNo2(Boardkind boardNo2) {
        this.boardNo2 = boardNo2;
    }

    public Cafe getCafeNo() {
        return cafeNo;
    }

    public void setCafeNo(Cafe cafeNo) {
        this.cafeNo = cafeNo;
    }

    public Keywordcate getKeySortNo() {
        return keySortNo;
    }

    public void setKeySortNo(Keywordcate keySortNo) {
        this.keySortNo = keySortNo;
    }

    public Theme getThemeNo() {
        return themeNo;
    }

    public void setThemeNo(Theme themeNo) {
        this.themeNo = themeNo;
    }

    public User getUserNo() {
        return userNo;
    }

    public void setUserNo(User userNo) {
        this.userNo = userNo;
    }

    public Zone getZoneNo() {
        return zoneNo;
    }

    public void setZoneNo(Zone zoneNo) {
        this.zoneNo = zoneNo;
    }

    public Set<Vote> getVotes() {
        return votes;
    }

    public void setVotes(Set<Vote> votes) {
        this.votes = votes;
    }

    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }

    public Set<Reply> getReplies() {
        return replies;
    }

    public void setReplies(Set<Reply> replies) {
        this.replies = replies;
    }

}