package kr.or.yi.repository;

import kr.or.yi.entity.Buycoupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuycouponRepository extends JpaRepository<Buycoupon, Integer> {
}