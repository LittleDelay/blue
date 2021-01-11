package com.lxs.blue.constant;

/**
 * 所有业务异常的枚举
 *
 * @author : xs.Liu
 * @date: 2020-12-31
 */
public enum BizExceptionEnum {

    /**
     * 通用异常
     */
    SERVER_ERROR(1000, "服务器异常"),
    REQUEST_NULL(1001, "请求参数有错误"),
    SESSION_TIMEOUT(1002, "会话超时"),
    PARAM_INVALID(1003,"参数无效"),
    PARAM_MISS(1004,"参数丢失"),
    METHOD_NOT_ALLOWED(1005, "不支持当前请求类型"),
    SQL_EX(1006, "运行SQL出现异常"),

    /**
     * token签名异常
     */
    TOKEN_EXPIRED(1900, "您的账号认证已失效,请重新登录!"),
    TOKEN_VERIFY(1901, "您的账号验证失败,请重新登录!"),
    TOKEN_ERROR(1902, "您的账号已在别处登录，请检查！"),
    SIGN_ERROR(1903, "签名验证失败"),
    TOKEN_ERROR_CID(1904, "非法Token,无法解析公司主键!"),
    TOKEN_NULL(1905, "您的账号认证已失效,请重新登录!"),

    /**
     * 字典
     */
    DICT_EXISTED(2001, "字典已经存在"),
    ERROR_CREATE_DICT(2002, "创建字典失败"),
    ERROR_WRAPPER_FIELD(2003, "包装字典属性失败"),
    ERROR_CODE_EMPTY(2004, "字典类型不能为空"),
    DICT_MUST_BE_NUMBER(2005, "字典的值必须为数字"),
    MENU_PCODE_COINCIDENCE(2006, "菜单编号和父编号不能一致"),
    EXISTED_THE_MENU(2007, "编号重复，不能添加"),
    DICT_NOT_EXISTED(2008, "字典不存在"),

    /**
     * 文件上传
     */
    FILE_READING_ERROR(2100, "FILE_READING_ERROR!"),
    FILE_NOT_FOUND(2101, "FILE_NOT_FOUND!"),
    UPLOAD_ERROR(2102, "上传图片出错"),
    FILE_UPDATE_ERROR(2103, "文件附件更新ID出错"),

    /**
     * 权限和数据问题
     */
    DB_RESOURCE_NULL(2200, "数据库中没有该资源"),
    NO_PERMITION(2201, "权限异常"),
    REQUEST_INVALIDATE(2202, "请求数据格式不正确"),
    INVALID_KAPTCHA(2203, "验证码不正确"),
    CANT_DELETE_ADMIN(2204, "不能删除超级管理员"),
    CANT_FREEZE_ADMIN(2205, "不能冻结超级管理员"),
    CANT_CHANGE_ADMIN(2206, "不能修改超级管理员角色"),

    /**
     * 账户问题
     */
    AUTH_REQUEST_ERROR(2300, "账号密码错误"),
    USER_ALREADY_REG(2301, "该用户已经注册或待审核,请核对用户信息"),
    NO_THIS_USER(2302, "没有此用户"),
    USER_NOT_EXISTED(2303, "没有此用户"),
    ACCOUNT_FREEZED(2304, "账号异常,请联系管理员!"),
    OLD_PWD_NOT_RIGHT(2305, "原密码不正确"),
    TWO_PWD_NOT_MATCH(2306, "两次输入密码不一致"),
    OLD_NEW_PWD_MATCH(2307, "新密码与原密码相同请重新设置"),

    /*
     * 物流错误信息
     */
    WULIU_APPCODE_ERROR(2401, "AppCode错误"),
    WULIU_METH_ERROR(2402, "请求的 Method、Path 或者环境错误"),
    WULIU_URL_ERROR(2403, "服务未被授权（或URL和Path不正确）"),
    WULIU_QUOTA_ERROR(2404, "套餐包次数用完 "),
    WULIU_PARAM_ERROR(2405, "参数错误"),

    /*
     * sms短信错误信息
     */
    SMS_MOBILE_ERROR(2501, "手机号异常"),
    SMS_SMS_TIME_ERROR(2502, "验证码已过期,请从新输入!"),
    SMS_MOBILE_SEND_ERROR(2503, "验证码发送异常"),
    SMS_SMS_ERROR(2504, "验证码有误,请从新输入!");


    BizExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public BusinessException businessException(){
        return new BusinessException(this);
    }

    private Integer code;

    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
