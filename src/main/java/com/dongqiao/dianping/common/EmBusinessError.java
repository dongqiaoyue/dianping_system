package com.dongqiao.dianping.common;

public enum EmBusinessError {

    //通用的错误类型10000开头
    NO_OBJECT_FOUND(10001,"Request object does not exist"),
    UNKNOWN_ERROR(10002,"Unknown error"),
    NO_HANDLER_FOUND(10003,"No handled path found"),
    BIND_EXCEPTION_ERROR(10004,"Wrong request parameter"),
    PARAMETER_VALIDATION_ERROR(10005,"Request parameter validation failed"),

    //用户服务相关的错误类型20000开头
    REGISTER_DUP_FAIL(20001,"User already exists"),

    LOGIN_FAIL(20002,"Phone number or password invalid"),

    //admin相关错误
    ADMIN_SHOULD_LOGIN(30001,"Admin should login first"),

    //品类相关错误
    CATEGORY_NAME_DUPLICATED(40001, "category name already exist");

    private Integer errCode;

    private String errMsg;

    EmBusinessError(Integer errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
