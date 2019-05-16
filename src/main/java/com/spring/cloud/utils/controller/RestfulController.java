package com.spring.cloud.utils.controller;

import com.spring.cloud.utils.utils.restful.RestfulUtil;
import com.spring.cloud.utils.utils.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(tags = "Restful请求工具类")
@CrossOrigin("*")
@RestController
@RequestMapping("/restful")
public class RestfulController {

    @Autowired
    private RestfulUtil restfulUtil;

    @ApiOperation(value = "get请求，返回JSON")
    @GetMapping(value = "get")
    public Result get(@RequestParam String url) {
        return restfulUtil.get(url);
    }

    @ApiOperation(value = "post请求，返回JSON",notes = "参数：String url, Map<String, Object> params")
    @PostMapping(value = "post")
    public Result okWithMessage(@RequestParam String url, @RequestParam Map<String, Object> params) {
        return restfulUtil.post(url, params);
    }
}
