package com.example.demo.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@MapperScan(value = "com.example.demo.mapper")
@RestController
public class PageController {
    @RequestMapping("hello")
        public String hello(){
            return "hello";
        }
}
