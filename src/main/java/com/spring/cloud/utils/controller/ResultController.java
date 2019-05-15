package com.spring.cloud.utils.controller;

import com.spring.cloud.utils.utils.result.Result;
import com.spring.cloud.utils.utils.result.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(value = "返回结果工具类")
@CrossOrigin("*")
@RestController
@RequestMapping("/utils/result")
public class ResultController {

    @ApiOperation(value = "正确结果")
    @GetMapping(value = "ok")
    public Result ok() {
        return ResultUtil.ok();
    }

    @ApiOperation(value = "正确结果带消息")
    @GetMapping(value = "okWithMessage")
    public Result okWithMessage(@RequestParam String message) {
        return ResultUtil.okWithMessage(message);
    }

    @ApiOperation(value = "正确结果带数据")
    @GetMapping(value = "okWithData")
    public Result okWithData(@RequestParam Object data) {
        return ResultUtil.okWithData(data);
    }

    @ApiOperation(value = "正确结果带数据和消息")
    @GetMapping(value = "okWithDataAndMessage")
    public Result okWithDataAndMessage(@RequestParam Object data, @RequestParam String message) {
        return ResultUtil.okWithDataAndMessage(data, message);
    }

    @ApiOperation(value = "服务熔断结果")
    @GetMapping(value = "isHystric")
    public Result isHystric(@RequestParam String serviceName) {
        return ResultUtil.isHystric(serviceName);
    }

}
