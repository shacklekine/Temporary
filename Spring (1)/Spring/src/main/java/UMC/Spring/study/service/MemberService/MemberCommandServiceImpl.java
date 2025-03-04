package UMC.Spring.study.service.MemberService;

import UMC.Spring.study.apiPlaynod.code.status.ErrorStatus;
import UMC.Spring.study.apiPlaynod.exception.handler.FoodCategoryHandler;
import UMC.Spring.study.converter.MemberConverter;
import UMC.Spring.study.converter.MemberPreferConverter;
import UMC.Spring.study.domain.Member;
import UMC.Spring.study.domain.food_category;
import UMC.Spring.study.domain.mapping.member_prefer;
import UMC.Spring.study.repository.FoodCategoryRepository;
import UMC.Spring.study.repository.MemberRepository;
import UMC.Spring.study.web.dto.MemberRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberCommandServiceImpl implements MemberCommandService{

    private final MemberRepository memberRepository;

    private final FoodCategoryRepository foodCategoryRepository;

    @Override
    @Transactional
    public Member joinMember(MemberRequestDTO.JoinDto request) {

        Member newMember = MemberConverter.toMember(request);
        List<food_category> foodCategoryList = request.getPreferCategory().stream()
                .map(category -> {
                    return foodCategoryRepository.findById(category).orElseThrow(() -> new FoodCategoryHandler(ErrorStatus.FOOD_CATEGORY_NOT_FOUND));
                }).collect(Collectors.toList());

        List<member_prefer> memberPreferList = MemberPreferConverter.toMemberPreferList(foodCategoryList);

        memberPreferList.forEach(memberPrefer -> {memberPrefer.setMember(newMember);});

        return memberRepository.save(newMember);
    }
}
