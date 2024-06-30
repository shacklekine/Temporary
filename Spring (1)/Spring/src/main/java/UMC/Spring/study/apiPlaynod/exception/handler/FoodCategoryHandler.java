package UMC.Spring.study.apiPlaynod.exception.handler;

import UMC.Spring.study.apiPlaynod.code.BaseErrorCode;
import UMC.Spring.study.apiPlaynod.exception.GeneralException;

public class FoodCategoryHandler extends GeneralException {
    public FoodCategoryHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}