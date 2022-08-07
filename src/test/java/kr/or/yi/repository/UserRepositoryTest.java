package kr.or.yi.repository;

import kr.or.yi.CoffeeMukkaSpringbootApplication;
import kr.or.yi.entity.Type;
import kr.or.yi.entity.TypeType;
import kr.or.yi.entity.User;
import kr.or.yi.entity.UserRole;
import kr.or.yi.exception.UserNotFoundException;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@DataJpaTest
@Log4j2
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

@ContextConfiguration(classes = CoffeeMukkaSpringbootApplication.class)
public class UserRepositoryTest {
    @Autowired UserRepository userRepository;
    @Autowired TypeRepository typeRepository;
    @PersistenceContext
    EntityManager em;

    @Test
    void createAndReadTest(){

        User user = createUser();
        userRepository.save(user);
        clear();

        User foundUser = userRepository.findById(user.getId()).orElseThrow(UserNotFoundException::new);
        assertThat(foundUser.getId()).isEqualTo(user.getId());

    }

//Integer id;
//String userId;
//String password;
//String name;
//String nick;
//Integer gender;
//Instant birthday;
//Instant userJoinDate;
//Integer userLeaveCondition;
//Integer point;
//String tel;
//String address;
//String detailAddress;
//String email;
//Integer userType;
//            user.setId(2);
//            user.setUserId("test");
//            user.setName("홍길동");
//            user.setEmail("test@yi.or.kr");
//            user.setAddress("대구광역시");
//            Calendar c1 = Calendar.getInstance();
//            Date dateOne = c1.getTime();
//            Instant inst = dateOne.toInstant();
//            user.setBirthday(inst);
//            user.setNick("돌아찌");
//            user.setPassword("1111");
//            user.setTel("1111111111");
//            user.setUserJoinDate(inst);


    private User createUserWithRoles(List<Type> types) {
        User user = new User("test2@yi.or.kr",
                "1111",
                "서우륵별시",
                "홍길동",
                "test20", types);
//            user.setId(1000);
//            user.setUserId("test");
//            user.setName("홍길동");
//            user.setEmail("test@yi.or.kr");
//            user.setAddress("대구광역시");
//            Calendar c1 = Calendar.getInstance();
//            Date dateOne = c1.getTime();
//            Instant inst = dateOne.toInstant();
//            user.setBirthday(inst);
//            user.setNick("돌아찌");
//            user.setPassword("1111");
//            user.setTel("1111111111");
//            user.setUserJoinDate(inst);
//            user.setTypes(types);
        return user;
    }
//
//    private User createUser(String id, String email, String name, String userId,Enum userType) {
//        return new User(id, email, name, userId, userType, emptyList());
//    }

    private User createUser() {
        User user = new User();
//        user.setId(2000);
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
        return user;
    }

    @Test
    void updateTest() {
        // given
        String updatedAddress= "updated";
        User member = userRepository.save(createUser());
        clear();

        // when
        User foundMember = userRepository.findById(member.getId()).orElseThrow(UserNotFoundException::new);
        foundMember.changeAddress(updatedAddress);
        clear();

        // then
        User updatedMember = userRepository.findById(member.getId()).orElseThrow(UserNotFoundException::new);
        assertThat(updatedMember.getAddress()).isEqualTo(updatedAddress);
    }

    @Test
    void userRoleCascadePersistTest() {
        // given
        List<TypeType> typeTypes = List.of(TypeType.ROLE_NORMAL, TypeType.ROLE_SPECIAL_BUYER, TypeType.ROLE_ADMIN);
        List<Type> types = typeTypes.stream().map(typeType -> new Type(typeType)).collect(Collectors.toList());
        typeRepository.saveAll(types);
        clear();

        User member = userRepository.save(createUserWithRoles(typeRepository.findAll()));
        clear();

        // when
        User foundMember = userRepository.findById(member.getId()).orElseThrow(UserNotFoundException::new);
        Set<UserRole> memberRoles = foundMember.getTypes();

        // then
        assertThat(memberRoles.size()).isEqualTo(types.size());
    }

    private Type createType() {
        return new Type(TypeType.ROLE_NORMAL);
    }


    private void clear() {
        em.flush(); // 1
        em.clear(); // 2
    }
}
