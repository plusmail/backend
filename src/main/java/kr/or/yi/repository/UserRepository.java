package kr.or.yi.repository;

import kr.or.yi.dto.UserDTO;
import kr.or.yi.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    @EntityGraph(attributePaths =  "email", type = EntityGraph.EntityGraphType.LOAD)
    @Query("select n from User n where n.email = :email")
    Optional<User> getWithEmail(String email);

    @EntityGraph(attributePaths =  "userId", type = EntityGraph.EntityGraphType.LOAD)
    @Query("select n from User n where n.id = :userId")
    Optional<User> getWithId(Integer userId);



    @Query("select n from User n")
    List<User> getWithAll();

//    @Modifying
//    @Query("UPDATE User u SET u.gender= :genderNo WHERE u.id = :userNo")
//    int updateUserGender(@Param(value="gender")Integer genderNo, @Param(value="id") Integer userNo);

    User readUserByUserIdEquals(String userId);

    User findByName(String name);
    User findByEmail(String email);

    List<User> findAllByEmail(String email);
    List<User> findAllByNameIn(List<String> names);
}