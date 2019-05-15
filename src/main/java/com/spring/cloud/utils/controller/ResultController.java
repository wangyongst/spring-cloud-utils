package com.spring.cloud.utils.controller;

import com.spring.cloud.utils.utils.result.Result;
import com.spring.cloud.utils.utils.result.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api
@CrossOrigin("*")
@RestController
@RequestMapping("/utils/result")
public class ResultController {

    @ApiOperation(value = "正确结果", notes = "提供用户注册服务")
    @GetMapping(value = "ok")
    public static Result ok() {
        return ResultUtil.ok();
    }

    @ApiOperation(value = "用户注册服务", notes = "提供用户注册服务")
    @GetMapping(value = "okWithMessage")
    public static Result okWithMessage(@RequestParam String message) {
        return ResultUtil.okWithMessage(message);
    }

    @ApiOperation(value = "用户注册服务", notes = "提供用户注册服务")
    @GetMapping(value = "okWithData")
    public static Result okWithData(@RequestParam Object data) {
        return ResultUtil.okWithData(data);
    }

    @ApiOperation(value = "用户注册服务", notes = "提供用户注册服务")
    @GetMapping(value = "okWithDataAndMessage")
    public static Result okWithDataAndMessage(@RequestParam Object data, @RequestParam String message) {
        return ResultUtil.okWithDataAndMessage(data,message);
    }

    @ApiOperation(value = "用户注册服务", notes = "提供用户注册服务")
    @GetMapping(value = "isHystric")
    public static Result isHystric(@RequestParam String serviceName) {
        return ResultUtil.isHystric(serviceName);
    }

}
