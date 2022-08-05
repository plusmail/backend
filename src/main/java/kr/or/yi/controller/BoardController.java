package kr.or.yi.controller;

import kr.or.yi.dto.BoardDTO;
import kr.or.yi.dto.PageRequestDTO;
import kr.or.yi.dto.PageResultDTO;
import kr.or.yi.entity.Board;
import kr.or.yi.service.BoardService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/board")
@Log4j2
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/")
    public String index(){
        return "redirect:/board/list";
    }

    @GetMapping("/list")
    public void list(PageRequestDTO pageRequestDTO, Model model) {
        log.info("list............." + pageRequestDTO);
        model.addAttribute("result", boardService.getList(pageRequestDTO));
    }

    @GetMapping("/api/list")
    public PageResultDTO<BoardDTO, Board> getAllBoards(PageRequestDTO pageRequestDTO){
        return  boardService.getList(pageRequestDTO);
    }

//    @GetMapping("/api/boardalll")
//    public List<Board> getAllBoards() {
//
//        return boardService.getAllBoard();
//    }

}
