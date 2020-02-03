package com.sun.provincecenter.util;

import com.sun.provincecenter.VO.ResultVO;
import com.sun.provincecenter.enums.ResultEnums;

/**
 * 返回值
 * @author zcm
 */
public class ResultVOUtil {

    /**
     * 成功
     * @param object
     * @return
     */
    public static ResultVO<Object> getSuccess(Object object){
        return new ResultVO<Object>(ResultEnums.SUCCESS.getCode(),ResultEnums.SUCCESS.getMessage(),object);
    }

    /**
     * 失败
     * @param object
     * @return
     */
    public static ResultVO<Object> getFailure(Object object){
        return new ResultVO<Object>(ResultEnums.FAILURE.getCode(),ResultEnums.FAILURE.getMessage(),object);
    }
}
