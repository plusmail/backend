package kr.or.yi.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class TblMemoDto implements Serializable {
    private final Long id;
    private final String memoText;
}
