package kr.or.yi.api;

import kr.or.yi.dto.UserDTO;
import kr.or.yi.entity.User;
import kr.or.yi.repository.UserRepository;
import kr.or.yi.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@Log4j2
@RequestMapping("/api/")
@RequiredArgsConstructor
public class ApiUserController {
    private final UserService userService; //final

    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "register")
    public ResponseEntity<Integer> register(@RequestBody UserDTO userDTO){

        log.info("-----------register-------------------------------");
        log.info(userDTO);

        Integer num = userService.register(userDTO);

        return new ResponseEntity<>(num, HttpStatus.OK);
    }


    @PostMapping(value = "/auth/login")
    public void login(@RequestBody UserDTO userDTO){

        log.info("-----------login-------------------------------");
        log.info(userDTO);


    }



    @GetMapping(value = "/{num}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> read(@PathVariable("num") Integer num){

        log.info("-----------read-------------------------------");
        log.info(num);
        return new ResponseEntity<>(userService.get(num), HttpStatus.OK);
    }


    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> getList(){

        log.info("-----------getListAll-------------------------------");
        List<User> users = userService.getAll();

        log.info("-----------getListAll "+ users);

        Map<String, Object> result = new HashMap<>();
        result.put("data", users);
        result.put("count", users.size());

        return ResponseEntity.ok().body(result);
    }

    @GetMapping(value="/{userid}")
    public Optional<User> readId(@PathVariable("userid") String userid){
        return Optional.ofNullable(userRepository.readUserByUserIdEquals(userid));
    }

    @GetMapping("/findUser/{id}")
    public Optional<User> findUserByName(@PathVariable String id) {
        return Optional.ofNullable(userRepository.readUserByUserIdEquals(id));
    }



}
