package kr.or.yi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;

@Builder
//@NoArgsConstructor
@AllArgsConstructor
@Data
public class BoardDTO implements Serializable {
    private final LocalDateTime regDate;
    private final LocalDateTime modDate;
    private final Integer id;
    private final Integer writingLockCondition;
    private final String writingTitle;
    private final Instant registrationDate;
    private final Instant updateDate;
    private final Integer viewNumber;
    private final Integer voteNumber;
    private final Integer boardDelCdt;
    private final String writingContent;
    private final String address;
    private final Integer replyCnt;
}
