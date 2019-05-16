package com.spring.cloud.utils.controller;

import com.spring.cloud.utils.utils.db.IdUtils;
import com.spring.cloud.utils.utils.db.TimeUtils;
import com.spring.cloud.utils.utils.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags= "数据库工具类")
@CrossOrigin("*")
@RestController
@RequestMapping("/db")
public class DbController {

    @ApiOperation(value = "生成31位长度ID")
    @GetMapping(value = "createId")
    public Result ok() {
        return IdUtils.createId();
    }

    @ApiOperation(value = "时间统一格式化为yyyy-MM-dd HH:mm:ss")
    @GetMapping(value = "formatTime")
    public Result ok(long time) {
        return TimeUtils.format(time);
    }
}
