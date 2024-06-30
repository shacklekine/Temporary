package UMC.Spring.study.web.controller;

import UMC.Spring.study.apiPlaynod.ApiResponse;
import UMC.Spring.study.converter.StoreConverter;
import UMC.Spring.study.domain.Review;
import UMC.Spring.study.service.StoreService.StoreCommandService;
import UMC.Spring.study.validation.annotation.ExistMember;
import UMC.Spring.study.validation.annotation.ExistStore;
import UMC.Spring.study.web.dto.StoreRequestDTO;
import UMC.Spring.study.web.dto.StoreResponseDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("/stores")
public class StoreRestController {

    private final StoreCommandService storeCommandService;

    @PostMapping("/{storeId}/reviews")
    public ApiResponse<StoreResponseDTO.CreateReviewResultDTO> createReview(@RequestBody @Valid StoreRequestDTO.ReveiwDTO request,
                                                                            @ExistStore @PathVariable(name = "storeId") Long storeId,
                                                                            @ExistMember @RequestParam(name = "memberId") Long memberId){
        Review review = storeCommandService.createReview(memberId, storeId, request);
        return ApiResponse.onSuccess(StoreConverter.toCreateReviewResultDTO(review));
    }
}
