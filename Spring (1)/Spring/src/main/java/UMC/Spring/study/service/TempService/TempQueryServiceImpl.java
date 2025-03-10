package UMC.Spring.study.service.TempService;

import UMC.Spring.study.apiPlaynod.code.status.ErrorStatus;
import UMC.Spring.study.apiPlaynod.exception.handler.TempHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class TempQueryServiceImpl implements TempQueryService{

    @Override
    public void CheckFlag(Integer flag) {
        if (flag == 1)
            throw new TempHandler(ErrorStatus.TEMP_EXCEPTION);
    }
}
