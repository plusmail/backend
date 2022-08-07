package kr.or.yi.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class MemberDto implements Serializable {
    private final Long id;
    private final String name;
    private final String username;
}
