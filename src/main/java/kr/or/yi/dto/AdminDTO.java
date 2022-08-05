package kr.or.yi.dto;

import kr.or.yi.entity.Authority;
import lombok.Data;

import java.io.Serializable;

@Data
public class AdminDTO implements Serializable {
    private final Integer id;
    private final String anoId;
    private final String anoPassword;
    private final String anoImage;
    private final Authority anoAuthorityNo;
}
