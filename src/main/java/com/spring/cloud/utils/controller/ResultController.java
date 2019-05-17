package com.spring.cloud.utils.controller;

import com.spring.cloud.utils.utils.result.Result;
import com.spring.cloud.utils.utils.result.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags= "返回结果工具类")
@CrossOrigin("*")
@RestController
@RequestMapping("/result")
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

    @ApiOperation(value = "查询失败结果带消息")
    @GetMapping(value = "queryErrorWithMessage")
    public Result queryErrorWithMessage(@RequestParam String message) {
        return ResultUtil.queryErrorWithMessage(message);
    }

    @ApiOperation(value = "创建失败结果带消息")
    @GetMapping(value = "createErrorWithMessage")
    public Result createErrorWithMessage(@RequestParam String message) {
        return ResultUtil.createErrorWithMessage(message);
    }

    @ApiOperation(value = "更新失败结果带消息")
    @GetMapping(value = "updateErrorWithMessage")
    public Result updateErrorWithMessage(@RequestParam String message) {
        return ResultUtil.updateErrorWithMessage(message);
    }

    @ApiOperation(value = "删除失败结果带消息")
    @GetMapping(value = "deleteErrorWithMessage")
    public Result deleteErrorWithMessage(@RequestParam String message) {
        return ResultUtil.deleteErrorWithMessage(message);
    }


    @ApiOperation(value = "缺少必需参数结果带消息")
    @GetMapping(value = "parameterNotEnoughWithMessage")
    public Result parameterNotEnoughWithMessage(@RequestParam String message) {
        return ResultUtil.parameterNotEnoughWithMessage(message);
    }

    @ApiOperation(value = "参数错误结果带消息")
    @GetMapping(value = "parameterErrorWithMessage")
    public Result parameterErrorWithMessage(@RequestParam String message) {
        return ResultUtil.parameterErrorWithMessage(message);
    }

    @ApiOperation(value = "结果为空异常带消息")
    @GetMapping(value = "isNullExceptionWithMessage")
    public Result isNullExceptionWithMessage(@RequestParam String message) {
        return ResultUtil.isNullExceptionWithMessage(message);
    }

    @ApiOperation(value = "Exception异常带消息")
    @GetMapping(value = "exceptionWithMessage")
    public Result exceptionWithMessage(@RequestParam String message) {
        return ResultUtil.exceptionWithMessage(message);
    }

    @ApiOperation(value = "IOException异常带消息")
    @GetMapping(value = "ioExceptionWithMessage")
    public Result ioExceptionWithMessage(@RequestParam String message) {
        return ResultUtil.ioExceptionWithMessage(message);
    }

}
