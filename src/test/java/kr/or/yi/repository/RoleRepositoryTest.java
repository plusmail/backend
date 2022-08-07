package kr.or.yi.repository;

import kr.or.yi.entity.Type;
import kr.or.yi.entity.TypeType;
import kr.or.yi.exception.UserNotFoundException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@DataJpaTest
class RoleRepositoryTest {

    @Autowired
    TypeRepository typeRepository;
    @PersistenceContext
    EntityManager em;

    @Test
    void createAndReadTest() { // 1
        // given
        Type type = createType();

        // when
        typeRepository.save(type);
        clear();

        // then
        Type foundRole = typeRepository.findById(type.getId()).orElseThrow(UserNotFoundException::new);
        assertThat(foundRole.getId()).isEqualTo(type.getId());
    }

    private Type createType() {
        return new Type(TypeType.ROLE_NORMAL);
    }

    private void clear() {
        em.flush();
        em.clear();
    }

}
