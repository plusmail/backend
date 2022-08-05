package kr.or.yi.service;

import kr.or.yi.dto.BoardDTO;
import kr.or.yi.dto.PageRequestDTO;
import kr.or.yi.dto.PageResultDTO;
import kr.or.yi.entity.Board;
import kr.or.yi.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {


    Integer register(BoardDTO dto);

    PageResultDTO<BoardDTO, Board> getList(PageRequestDTO requestDTO);


    default Board dtoToEntity(BoardDTO dto) {
        Board entity = Board.builder()
                .id(dto.getId())
                .address(dto.getAddress())
                .build();

        return entity;
    }

    default BoardDTO entityToDto(Board entity) {
        BoardDTO dto = BoardDTO.builder()
                .id((500))
                .address(entity.getAddress())
                .build();

        return dto;
    }

}
