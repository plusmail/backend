package kr.or.yi.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "faq")
public class Faq {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "faq_no", nullable = false)
    private Integer id;

    @Column(name = "writing_title", nullable = false)
    private String writingTitle;

    @Column(name = "registration_date", nullable = false)
    private Instant registrationDate;

    @Column(name = "update_date", nullable = false)
    private Instant updateDate;

    @Column(name = "view_number", nullable = false)
    private Integer viewNumber;

    @Lob
    @Column(name = "questian", nullable = false)
    private String questian;

    @Lob
    @Column(name = "answer", nullable = false)
    private String answer;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "faq_sort_no", nullable = false)
    private Faqcate faqSortNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWritingTitle() {
        return writingTitle;
    }

    public void setWritingTitle(String writingTitle) {
        this.writingTitle = writingTitle;
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

    public Integer getViewNumber() {
        return viewNumber;
    }

    public void setViewNumber(Integer viewNumber) {
        this.viewNumber = viewNumber;
    }

    public String getQuestian() {
        return questian;
    }

    public void setQuestian(String questian) {
        this.questian = questian;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Faqcate getFaqSortNo() {
        return faqSortNo;
    }

    public void setFaqSortNo(Faqcate faqSortNo) {
        this.faqSortNo = faqSortNo;
    }

}