package com.lxs.blue.bean;

import com.lxs.blue.constant.BizExceptionEnum;
import com.lxs.blue.constant.BusinessException;

/**
 * API返回结果组装工具
 *
 * @author : xs.Liu
 * @date: 2020-12-31
 */
public class ResponseKit {

    public static SuccessResponseData success() {
        return new SuccessResponseData();
    }

    public static <T> SuccessResponseData success(T object) {
        return new SuccessResponseData(object);
    }

    public static <T> SuccessResponseData success(String message, T object) {
        return new SuccessResponseData(message, object);
    }

    public static ErrorResponseData fail(BusinessException be) {
        return new ErrorResponseData(be.getErrCode(), be.getErrMsg());
    }

    public static ErrorResponseData fail(BizExceptionEnum be) {
        return new ErrorResponseData(be);
    }

    public static ErrorResponseData fail(BizExceptionEnum be, String message) {
        return new ErrorResponseData(be, message);
    }

    public static ErrorResponseData fail(BizExceptionEnum be, Object object) {
        return new ErrorResponseData(be, object);
    }

    public static ErrorResponseData fail(Integer code, String message) {
        return new ErrorResponseData(code, message);
    }

    public static ErrorResponseData fail(Integer code, String message, Object object) {
        return new ErrorResponseData(code, message, object);
    }

}
