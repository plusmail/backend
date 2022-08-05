package kr.or.yi.service;

import kr.or.yi.dto.BoardDTO;
import kr.or.yi.dto.PageRequestDTO;
import kr.or.yi.dto.PageResultDTO;
import kr.or.yi.dto.UserDTO;
import kr.or.yi.entity.Board;
import kr.or.yi.entity.User;
import kr.or.yi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface UserService {

    Integer register(UserDTO dto);
    UserDTO get(Integer num);

    void login(UserDTO dto);

    UserDTO get(String email);

    List<User> getAll();

//    UserDTO readId(String userid);

    void modify(UserDTO userDTO);
    void remove(Integer num);

    List<UserDTO> getAllWithEmail(String email);


    PageResultDTO<UserDTO, User> getList(PageRequestDTO requestDTO);

    default User dtoToEntity(UserDTO dto) {
        User entity = User.builder()
                .id(dto.getId())
                .userId(dto.getUserId())
                .password(dto.getPassword())
                .name(dto.getName())
                .nick(dto.getNick())
                .gender(dto.getGender())
                .birthday(dto.getBirthday())
                .userJoinDate(dto.getUserJoinDate())
                .point(dto.getPoint())
                .tel(dto.getTel())
                .address(dto.getAddress())
                .detailAddress(dto.getDetailAddress())
                .email(dto.getUserId())
                .build();

        return entity;
    }

    default UserDTO entityToDto(User entity) {
        UserDTO dto = UserDTO.builder()
                .id(entity.getId())
                .userId(entity.getUserId())
                .password(entity.getPassword())
                .name(entity.getName())
                .nick(entity.getNick())
                .gender(entity.getGender())
                .birthday(entity.getBirthday())
                .userJoinDate(entity.getUserJoinDate())
                .point(entity.getPoint())
                .tel(entity.getTel())
                .address(entity.getAddress())
                .detailAddress(entity.getDetailAddress())
                .email(entity.getEmail())
                .build();

        return dto;
    }

}

