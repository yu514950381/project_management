package com.feima.project_management.controller;

import com.feima.project_management.service.MissionManagementService;
import com.feima.project_management.util.JSONTool;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
@RequestMapping("/missionManagementCtrl")
public class MissionManagementCtrl {
    @Resource(name = "/missionManagementService")
    MissionManagementService missionManagementService;

    @RequestMapping("/missionManagement")
    public ModelAndView test(ModelAndView modelAndView){
        modelAndView.setViewName("missionManagement");
        return modelAndView;
    }

    @RequestMapping("/showAllMission")
    public String showallmission(){
        String result = JSONTool.JsonToLayui(this.missionManagementService.missionSelect());
        return result;
    }

}
