package com.spring.cloud.utils.utils.result;

public class ResultUtil {

    public static Result ok() {
        Result result = new Result();
        result.setCode(ResultCode.OK);
        return result;
    }

    public static Result okWithMessage(String message) {
        Result result = new Result();
        result.setCode(ResultCode.OK);
        result.setMessage(message);
        return result;
    }

    public static Result okWithData(Object data) {
        Result result = new Result();
        result.setCode(ResultCode.OK);
        result.setData(data);
        return result;
    }

    public static Result okWithDataAndMessage(Object data, String message) {
        Result result = new Result();
        result.setCode(ResultCode.OK);
        result.setData(data);
        result.setMessage(message);
        return result;
    }

    public static Result isHystric(String serviceName) {
        Result result = new Result();
        result.setCode(ResultCode.HYSTRIC);
        result.setMessage(serviceName + "服务访问失败，请联系管理员！");
        return result;
    }
}
