package com.study.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CustomerApi {

    @GetMapping("/")
    public String getTestApi(){

        return "String";
    }


}
