package kr.or.yi.service;

import kr.or.yi.dto.BoardDTO;
import kr.or.yi.dto.PageRequestDTO;
import kr.or.yi.dto.PageResultDTO;
import kr.or.yi.entity.Board;
import kr.or.yi.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;

@Service
@Log4j2
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardRepository repository;

    @Override
    public Integer register(BoardDTO dto)
    {
        log.info("DTO=====================");
        log.info(dto);

        Board entity = dtoToEntity(dto);
        log.info(entity);

        repository.save(entity);


        return entity.getId();
    }

    @Override
    public PageResultDTO<BoardDTO, Board> getList(PageRequestDTO requestDTO){
        Pageable pageable = requestDTO.getPageable(Sort.by("id").descending());
        Page<Board> result = repository.findAll(pageable);
        Function<Board, BoardDTO> fn = (entity -> entityToDto(entity));

        return new PageResultDTO<>(result, fn);
    }

}
