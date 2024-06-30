package UMC.Spring.study.service.StoreService;

import UMC.Spring.study.converter.StoreConverter;
import UMC.Spring.study.domain.Review;
import UMC.Spring.study.repository.MemberRepository;
import UMC.Spring.study.repository.ReviewRepository;
import UMC.Spring.study.repository.StoreRepository;
import UMC.Spring.study.web.dto.StoreRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@RequiredArgsConstructor
public class StoreCommandServiceImpl implements StoreCommandService{

    private final ReviewRepository reviewRepository;

    private final MemberRepository memberRepository;

    private final StoreRepository storeRepository;

    @Override
    public Review createReview(Long memberId, Long storeId, StoreRequestDTO.ReveiwDTO request) {

        Review review = StoreConverter.toReview(request);

        review.setMember(memberRepository.findById(memberId).get());
        review.setStore(storeRepository.findById(storeId).get());

        return reviewRepository.save(review);
    }
}