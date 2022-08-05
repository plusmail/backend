package kr.or.yi.service;

import kr.or.yi.dto.BoardDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardServiceTests {
    @Autowired
    private BoardService service;

    @Test
    public void testRegister(){
        BoardDTO board = BoardDTO.builder()
                .id(Integer.valueOf("500"))
                .address("aaaa")
                .boardDelCdt(Integer.valueOf("1"))
                .build();

                System.out.println(service.register(board));
    }
}
