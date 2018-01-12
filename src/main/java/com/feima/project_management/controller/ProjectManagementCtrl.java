package com.feima.project_management.controller;


import com.feima.project_management.model.Project;
import com.feima.project_management.service.ProjectManagementService;
import com.feima.project_management.util.JSONTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.UUID;


@Controller
@RequestMapping("/projectManagementCtrl")
public class ProjectManagementCtrl {

    @Autowired
    private ProjectManagementService projectManagementService;

    @ResponseBody
    @RequestMapping("/showAll")
    public String showAll(){
        String result = JSONTool.JsonToLayui(projectManagementService.selectProjectAll());
        return result;
    }
    //添加项目入口
    @RequestMapping("/addProject")
    public String addProject(Map<String,Project> map){
        Project p = new Project();
        map.put("project",p);
        return "add_project";
    }
    /*
    执行添加项目管理操作
     */
    @RequestMapping(value = "/doAddProject",method = RequestMethod.POST)
    public String doAddProject(@ModelAttribute("project") Project project){
        project.setProject_Id(UUID.randomUUID().toString().replaceAll("-",""));
        projectManagementService.insertProject(project);
        return "/projectManagementCtrl/addProject";
    }
}
