package UMC.Spring.study.service.StoreService;

import UMC.Spring.study.domain.Review;
import UMC.Spring.study.web.dto.StoreRequestDTO;

public interface StoreCommandService {

    Review createReview(Long memberId, Long storeId, StoreRequestDTO.ReveiwDTO request);
}
