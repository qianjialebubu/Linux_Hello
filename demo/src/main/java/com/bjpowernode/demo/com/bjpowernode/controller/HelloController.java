package com.bjpowernode.demo.com.bjpowernode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qjl
 * @create 2022-09-28 19:02
 */
@RestController
@RequestMapping("/hello")

public class HelloController {
    @GetMapping("")
    public String hello(){
        System.out.println("Hello!");
        return "Hello!";
    }
}
