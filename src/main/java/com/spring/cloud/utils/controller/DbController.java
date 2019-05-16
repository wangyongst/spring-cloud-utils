package com.spring.cloud.utils.controller;

import com.spring.cloud.utils.utils.db.IdUtils;
import com.spring.cloud.utils.utils.db.TimeUtils;
import com.spring.cloud.utils.utils.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags= "数据库工具类")
@CrossOrigin("*")
@RestController
@RequestMapping("/db")
public class DbController {

    @ApiOperation(value = "生成32位长度ID")
    @GetMapping(value = "createId")
    public Result createId() {
        return IdUtils.createId();
    }

    @ApiOperation(value = "时间统一格式化为yyyy-MM-dd HH:mm:ss")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "time", value = "要格式化的时间（必需，类型为long）", required = true)
    })
    @GetMapping(value = "formatTime")
    public Result formatTime(long time) {
        return TimeUtils.format(time);
    }
}
