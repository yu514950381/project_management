package com.feima.project_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test1")
public class test {

    @RequestMapping("/test2")
    public String hello(){
        return "index";
    }

}
