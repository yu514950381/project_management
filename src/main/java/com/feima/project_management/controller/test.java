package com.feima.project_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jump")
public class test {

    @RequestMapping("/test")
    public String hello(){
        return "index";
    }

    @RequestMapping("/memberManagement")
    public String memberManagement(){
        return "member_management";
    }
    @RequestMapping("/memberManagement1")
    public String memberManagement1(){
        return "member_management1";
    }
    @RequestMapping("/projectManagement")
    public String projectManagement(){
        return "project_management";
    }
    @RequestMapping("/addProject")
    public String addProject(){
        return "add_project";
    }
}










