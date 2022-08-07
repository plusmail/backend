package kr.or.yi.service;


import kr.or.yi.dto.PageRequestDTO;
import kr.or.yi.dto.PageResultDTO;
import kr.or.yi.dto.UserDTO;
import kr.or.yi.entity.User;
import kr.or.yi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@Log4j2
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Integer register(UserDTO dto)
    {
        log.info("DTO=====================");
        log.info(dto);

        User entity = dtoToEntity(dto);
        log.info(entity);

        userRepository.save(entity);

        return entity.getId();
    }

    @Override
    public void login(UserDTO userDTO) {
        log.info("login=====================" + userDTO.getUserId());

//        Optional<User> result = userRepository.getWithId(num);
//        if( result.isPresent()){
//            log.info("get num======================2" + result);
//            return entityToDto(result.get());
//        }
//        return null;
    }


    @Override
    public UserDTO get(Integer num) {
        log.info("get num=====================" + num);

        Optional<User> result = userRepository.getWithId(num);
        if( result.isPresent()){
            log.info("get num======================2" + result);
            return entityToDto(result.get());
        }
        return null;
    }

    @Override
    public List<User>  getAll() {
        log.info("getAll======================1");
        List<User> result = userRepository.getWithAll();
        log.info("getAll======================2");
        if( !result.isEmpty()){
            return result;
        }
        return null;
    }

    @Override
    public UserDTO get(String email)
    {
        Optional<User> result = userRepository.getWithEmail(email);
        return result.map(this::entityToDto).orElse(null);
    }

    @Override
    public void modify(UserDTO userDTO){
        Integer num = userDTO.getId();
        Optional<User> result = userRepository.findById(num);
        if(result.isPresent()){
            User user = result.get();
            user.changeEmail(userDTO.getEmail());
            user.changeAddress(userDTO.getAddress());
            userRepository.save(user);
        }
    }

    @Override
    public List<UserDTO> getAllWithEmail(String email) {

        Optional<User> userList = userRepository.getWithEmail(email);

        return userList.stream().map(user->entityToDto(user)).collect(Collectors.toList());
    }

    @Override
    public void remove(Integer num) {

        userRepository.deleteById(num);

    }

//    @Override
//    public UserDTO readId(String userid) {
//
//        Optional<User> result = Optional.ofNullable(userRepository.readUserByUserIdEquals(userid));
//        return null;
//    }
//



    @Override
    public PageResultDTO<UserDTO, User> getList(PageRequestDTO requestDTO) {
        Pageable pageable = requestDTO.getPageable(Sort.by("userId").descending());
        Page<User> result = userRepository.findAll(pageable);
        Function<User, UserDTO> fn = (entity -> entityToDto(entity));
        return new PageResultDTO<>(result, fn );
    }


    public List<User> getUsers(){

        return null;
    }

    public List<User> getUsersByNames(List<String> names){

        return null;
    }

    public List<User> getUsersByEmail(String email){

        return null;
    }
}