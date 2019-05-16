package com.spring.cloud.utils.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Api
@CrossOrigin("*")
@RestController
@RequestMapping("/restful")
public class RestfulController {

    @Autowired
    public RestTemplate restTemplate;
}
