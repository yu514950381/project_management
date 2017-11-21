package com.feima.project_management.controller;


import com.feima.project_management.service.ProjectManagementService;
import com.feima.project_management.util.JSONTool;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/projectManagementCtrl")
public class ProjectManagementCtrl {

    @Resource(name = "/projectManagementService")
    private ProjectManagementService projectManagementService;

    @RequestMapping("/showAll")
    public String showAll(){
        String result = JSONTool.JsonToLayui(projectManagementService.selectProjectAll());
        return result;
    }
}
