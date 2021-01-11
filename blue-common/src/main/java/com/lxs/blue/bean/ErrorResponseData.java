package com.lxs.blue.bean;

import com.lxs.blue.constant.BizExceptionEnum;

/**
 * 失败操作返回的数据模型定义
 *
 * @author : xs.Liu
 * @date: 2020-12-31
 */
public class ErrorResponseData extends ApiResponse {

    public ErrorResponseData(BizExceptionEnum be) {
        super(false, be.getCode(), be.getMessage(), null);
    }

    public ErrorResponseData(BizExceptionEnum be, String message) {
        super(false, be.getCode(), message, null);
    }

    public ErrorResponseData(BizExceptionEnum be, Object object) {
        super(false, be.getCode(), be.getMessage(), object);
    }

    public ErrorResponseData(Integer code, String message) {
        super(false, code, message, null);
    }

    public ErrorResponseData(Integer code, String message, Object object) {
        super(false, code, message, object);
    }

}
