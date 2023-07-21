package com.emts.common.result;


public class ResultBuilder {

    public static Result success() {
        return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage(), true);
    }


    public static Result success(Object data) {
        return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage(), data);
    }

    public static Result error() {
        return new Result(ResultEnum.COMMON_ERROR.getCode(), ResultEnum.COMMON_ERROR.getMessage(), false);
    }

    public static Result error(Object data) {
        return new Result(ResultEnum.COMMON_ERROR.getCode(), ResultEnum.COMMON_ERROR.getMessage(), data);
    }

    public static Result buildResult(Integer code, String message, Object data) {
        return new Result(code, message, data);
    }

    public static Result buildResult(boolean result) {
        return result ? success() : error();
    }
}
