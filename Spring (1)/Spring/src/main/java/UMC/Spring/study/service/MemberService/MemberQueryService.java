package UMC.Spring.study.service.MemberService;

import UMC.Spring.study.domain.Member;

import java.util.Optional;

public interface MemberQueryService {

    Optional<Member> findMember(Long id);

}
