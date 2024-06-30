package UMC.Spring.study.apiPlaynod.exception.handler;

import UMC.Spring.study.apiPlaynod.code.BaseErrorCode;
import UMC.Spring.study.apiPlaynod.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
