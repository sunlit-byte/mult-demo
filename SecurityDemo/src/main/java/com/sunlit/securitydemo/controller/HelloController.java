package com.sunlit.securitydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YourName
 * @date 2023-02-04 19:51
 **/

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String Hello(){
        return "hello";
    }
}
