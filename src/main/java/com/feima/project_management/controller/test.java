package com.feima.project_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jump")
public class test {

    @RequestMapping("/test2")
    public String hello(){
        return "index";
    }

    @RequestMapping("/memberManagement")
    public String memberManagement(){
        return "member_management";
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










