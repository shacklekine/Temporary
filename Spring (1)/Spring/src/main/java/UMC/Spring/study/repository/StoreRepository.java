package UMC.Spring.study.repository;

import UMC.Spring.study.domain.store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<store, Long> {
}
