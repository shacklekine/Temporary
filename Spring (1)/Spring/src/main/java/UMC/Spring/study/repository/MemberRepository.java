package UMC.Spring.study.repository;

import UMC.Spring.study.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
