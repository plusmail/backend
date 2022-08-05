package kr.or.yi.controller;

import kr.or.yi.entity.User;
import kr.or.yi.repository.UserRepository;
import kr.or.yi.service.UserService;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@SpringBootTest
@Transactional
class UserServiceTest {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    private int count = 1000;
    List<User> userDatas;
    List<String> names;

    @BeforeEach
    void setUp() {
        userDatas = LongStream.range(1, count + 1)
                .mapToObj(number -> new User("이름" + number, "이메일"))
                .collect(Collectors.toList());
        names = userDatas.stream()
                .map(User::getName)
                .collect(Collectors.toList());

        System.out.println("---------------insert---------------");
        userRepository.saveAll(userDatas);
    }

    @Test
    void findAllTest() {
        System.out.println("---------------findAll---------------");
        List<User> users = userService.getUsers();
        Assertions.assertThat(users.size()).isEqualTo(count);
    }

    @Test
    void findAllByNamesTest() {
        System.out.println("---------------findAllByNames---------------");
        List<User> usersByNames = userService.getUsersByNames(names);
        Assertions.assertThat(usersByNames.size()).isEqualTo(count);
    }

    @Test
    void findAllByEmailTest() {
        System.out.println("---------------findAllByEmail---------------");
        List<User> usersByEmail = userService.getUsersByEmail("이메일");
        Assertions.assertThat(usersByEmail.size()).isEqualTo(count);
    }
}