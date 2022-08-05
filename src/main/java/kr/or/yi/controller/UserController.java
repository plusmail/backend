package kr.or.yi.controller;

import kr.or.yi.dto.PageRequestDTO;
import kr.or.yi.dto.PageResultDTO;
import kr.or.yi.entity.User;
import kr.or.yi.dto.UserDTO;
import kr.or.yi.repository.AdminRepository;
import kr.or.yi.repository.BoardRepository;
import kr.or.yi.repository.UserRepository;
import kr.or.yi.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping(value = "//user")
@Log4j2
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private final UserService userService;


    @RequestMapping(value = "/user")
    public String userModel(Model model) {
        List<UserDTO> list = IntStream.rangeClosed(1, 20).asLongStream().
                mapToObj(i -> {
                    return UserDTO.builder()
                            .id((int) i)
                            .build();
                        }
                ).collect(Collectors.toList());
        model.addAttribute("list", list);
        return "list";
    }

    @GetMapping("/useradd")
    @ResponseBody
    public User create(User user) {
        user.setId(2);
        user.setUserId("test");
        user.setName("홍길동");
        user.setEmail("test@yi.or.kr");
        user.setAddress("대구광역시");
        Calendar c1 = Calendar.getInstance();
        Date dateOne = c1.getTime();
        Instant inst = dateOne.toInstant();
        user.setBirthday(inst);
        user.setNick("돌아찌");
        user.setPassword("1111");
        user.setTel("1111111111");
        user.setUserJoinDate(inst);
        return userRepository.save(user);
    }

    @GetMapping("/findUser/{id}")
    public Optional<User> findUserByName(@PathVariable String id) {
        return userRepository.findById(Integer.valueOf(id));
    }

    @GetMapping("/findAll")
    public List<User> showAll() {
        List<User> userAlllist = userRepository.findAll();
        String result = userAlllist.stream().map(n -> String.valueOf(n)).collect(Collectors.joining());
        return userAlllist;
    }

    @GetMapping(value = "/list")
    public void list(PageRequestDTO pageRequestDTO, Model model) {
        log.info("list............" + pageRequestDTO);
        model.addAttribute("result", userService.getList(pageRequestDTO));
    }

    @GetMapping("/api/list")
    public PageResultDTO<UserDTO, User> getAllUsers(PageRequestDTO pageRequestDTO) {
        return userService.getList(pageRequestDTO);
    }

//    @GetMapping("/api/userlistpage")
//    public List<User> getAllBoards() {
//
//        return userService.getAllBoard();
//    }

}
