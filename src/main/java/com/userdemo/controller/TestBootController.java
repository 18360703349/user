package com.userdemo.controller;

import com.userdemo.domian.Sysperson;
import com.userdemo.service.TestBootService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by hk on 2018/11/5.
 */
@RestController
@EnableAutoConfiguration
public class TestBootController {

    @Resource(name = "testBootService")
    TestBootService testBootService;

    @RequestMapping("demo")
    @ResponseBody
    public Sysperson getSysperson(){
        Sysperson sysperson = testBootService.getSysperson();
        return sysperson;
    }
}
