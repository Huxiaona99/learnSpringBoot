package com.nx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fangjun on 2018/4/4.
 */
@RestController
public class TestController {

    @RequestMapping("/")
    public String home(){

        return "hello world";
    }
}
