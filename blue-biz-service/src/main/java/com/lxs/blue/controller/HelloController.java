package com.lxs.blue.controller;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

/**
 * @author : xs.Liu
 * @date: 2021-01-04
 */
@RestController
@RequestMapping("/hello")
@Api(tags = "用户操作")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class HelloController {

    @GetMapping("/hi")
    public String hello() {
        System.out.println("Hello world!!!");
        return "Hello world!";
    }

}
