package kr.or.yi.repository;

import kr.or.yi.entity.Board;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class BoardRepositoryTests {

    @Autowired
    private BoardRepository boardRepository;

//    @Test
//    public void insertDummies(){
//        IntStream.rangeClosed(1,300).forEach( i -> {
//            Board board = Board.builder()
//                    .id(Integer.valueOf("500"))
//                    .address("contest .." + i)
//                    .build();
//
//                    System.out.println(boardRepository.save(board));
//        });
//    }
}
