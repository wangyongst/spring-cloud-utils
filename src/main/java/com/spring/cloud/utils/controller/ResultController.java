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

    @ApiOperation(value = "查询失败结果带数据和消息")
    @GetMapping(value = "queryErrorWithDataAndMessage")
    public Result queryErrorWithDataAndMessage(@RequestParam Object data, @RequestParam String message) {
        return ResultUtil.queryErrorWithDataAndMessage(data, message);
    }

    @ApiOperation(value = "创建失败结果带数据和消息")
    @GetMapping(value = "createErrorWithDataAndMessage")
    public Result createErrorWithDataAndMessage(@RequestParam Object data, @RequestParam String message) {
        return ResultUtil.createErrorWithDataAndMessage(data, message);
    }

    @ApiOperation(value = "更新失败结果带数据和消息")
    @GetMapping(value = "updateErrorWithDataAndMessage")
    public Result updateErrorWithDataAndMessage(@RequestParam Object data, @RequestParam String message) {
        return ResultUtil.updateErrorWithDataAndMessage(data, message);
    }

    @ApiOperation(value = "删除失败结果带数据和消息")
    @GetMapping(value = "deleteErrorWithDataAndMessage")
    public Result deleteErrorWithDataAndMessage(@RequestParam Object data, @RequestParam String message) {
        return ResultUtil.deleteErrorWithDataAndMessage(data, message);
    }


    @ApiOperation(value = "缺少必需参数结果带数据和消息")
    @GetMapping(value = "parameterNotEnoughWithDataAndMessage")
    public Result parameterNotEnoughWithDataAndMessage(@RequestParam Object data, @RequestParam String message) {
        return ResultUtil.parameterNotEnoughWithDataAndMessage(data, message);
    }

    @ApiOperation(value = "参数错误结果带数据和消息")
    @GetMapping(value = "parameterErrorWithDataAndMessage")
    public Result parameterErrorWithDataAndMessage(@RequestParam Object data, @RequestParam String message) {
        return ResultUtil.parameterErrorWithDataAndMessage(data, message);
    }

}
