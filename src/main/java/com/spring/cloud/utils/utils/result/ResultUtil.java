package com.spring.cloud.utils.utils.result;

public class ResultUtil {

    public static Result ok() {
        Result result = new Result();
        result.setStatus(ResultStatus.OK);
        return result;
    }

    public static Result okWithMessage(String message) {
        Result result = new Result();
        result.setStatus(ResultStatus.OK);
        result.setMessage(message);
        return result;
    }

    public static Result okWithData(Object data) {
        Result result = new Result();
        result.setStatus(ResultStatus.OK);
        result.setData(data);
        return result;
    }

    public static Result okWithDataAndMessage(Object data, String message) {
        Result result = new Result();
        result.setStatus(ResultStatus.OK);
        result.setData(data);
        result.setMessage(message);
        return result;
    }

    public static Result queryErrorWithDataAndMessage(Object data, String message) {
        Result result = new Result();
        result.setStatus(ResultStatus.QUERY_ERROR);
        result.setData(data);
        result.setMessage(message);
        return result;
    }

    public static Result createErrorWithDataAndMessage(Object data, String message) {
        Result result = new Result();
        result.setStatus(ResultStatus.CREATE_ERROR);
        result.setData(data);
        result.setMessage(message);
        return result;
    }

    public static Result updateErrorWithDataAndMessage(Object data, String message) {
        Result result = new Result();
        result.setStatus(ResultStatus.UPDATE_ERROR);
        result.setData(data);
        result.setMessage(message);
        return result;
    }

    public static Result deleteErrorWithDataAndMessage(Object data, String message) {
        Result result = new Result();
        result.setStatus(ResultStatus.DELETE_ERROR);
        result.setData(data);
        result.setMessage(message);
        return result;
    }

    public static Result parameterNotEnoughWithDataAndMessage(Object data, String message) {
        Result result = new Result();
        result.setStatus(ResultStatus.PARAMETER_NOT_ENOUGH);
        result.setData(data);
        result.setMessage(message);
        return result;
    }

    public static Result parameterErrorWithDataAndMessage(Object data, String message) {
        Result result = new Result();
        result.setStatus(ResultStatus.PARAMETER_ERROR);
        result.setData(data);
        result.setMessage(message);
        return result;
    }
}
