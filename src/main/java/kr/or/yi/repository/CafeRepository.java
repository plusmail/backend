package kr.or.yi.repository;

import kr.or.yi.entity.Cafe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CafeRepository extends JpaRepository<Cafe, Integer> {

}