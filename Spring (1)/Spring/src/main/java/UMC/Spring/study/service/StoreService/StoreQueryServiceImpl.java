package UMC.Spring.study.service.StoreService;

import UMC.Spring.study.domain.store;
import UMC.Spring.study.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class StoreQueryServiceImpl implements StoreQueryService{

    private final StoreRepository storeRepository;

    @Override
    public Optional<store> findStore(Long id) {
        return storeRepository.findById(id);
    }
}
