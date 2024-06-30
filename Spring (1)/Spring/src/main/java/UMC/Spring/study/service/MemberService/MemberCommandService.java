package UMC.Spring.study.service.MemberService;

import UMC.Spring.study.domain.Member;
import UMC.Spring.study.web.dto.MemberRequestDTO;

public interface MemberCommandService {

    Member joinMember(MemberRequestDTO.JoinDto request);
}
