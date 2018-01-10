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
    @RequestMapping("/historyManagement")
    public String historyManagement(){
        return "historyManagement";
    }
    @RequestMapping("/memberManagement")
    public String memberManagement(){
        return "memberManagement";
    }
    @RequestMapping("/projectManagement")
    public String projectManagement(){
        return "project_management";
    }
    @RequestMapping("/addProject")
    public String addProject(){
        return "add_project";
    }
    @RequestMapping("/missionManagement")
    public String missionManagement() {
        return "/missionManagementCtrl";
    }
}










