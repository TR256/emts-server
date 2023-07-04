package com.emts.common.result;

public enum ResultEnum {
    SUCCESS(20000, "接口调用成功"),
    VALIDATE_ERROR(2002, "参数校验失败"),
    COMMON_ERROR(2003, "接口调用失败"),
    FORBIDDEN(2004, "没有权限访问资源");

    private final Integer code;
    private final String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    public Integer getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
}
