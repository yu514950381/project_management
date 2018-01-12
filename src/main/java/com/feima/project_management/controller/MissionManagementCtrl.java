package com.feima.project_management.controller;

import com.feima.project_management.service.MissionManagementService;
import com.feima.project_management.util.JSONTool;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MissionManagementCtrl {
    @Resource(name = "/missionManagementService")
    MissionManagementService missionManagementService;

    @RequestMapping("/showAllMission")
    public String showallmission(){
        String result = JSONTool.JsonToLayui(this.missionManagementService.missionSelect());
        return result;
    }
}
