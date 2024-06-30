package UMC.Spring.study.service.StoreService;


import UMC.Spring.study.domain.store;

import java.util.Optional;

public interface StoreQueryService {

    Optional<store> findStore(Long id);
}
