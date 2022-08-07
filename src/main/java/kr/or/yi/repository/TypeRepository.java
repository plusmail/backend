package kr.or.yi.repository;

import kr.or.yi.entity.Type;
import kr.or.yi.entity.TypeType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TypeRepository extends JpaRepository<Type, Integer> {

    Optional<Type> findByUserTypeName(TypeType typeType);

    Optional<Object> findByTypeType(TypeType roleNormal);
}