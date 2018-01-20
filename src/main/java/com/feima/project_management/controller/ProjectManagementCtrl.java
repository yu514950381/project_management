package com.feima.project_management.controller;


import com.feima.project_management.model.Project;
import com.feima.project_management.service.ProjectManagementService;
import com.feima.project_management.util.JSONTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.UUID;


@Controller
@RequestMapping("/projectManagementCtrl")
public class ProjectManagementCtrl {

    @Resource(name = "/projectManagementService")
    private ProjectManagementService projectManagementService;

    @ResponseBody
    @RequestMapping("/showAll")
    public String showAll(){
        String result = JSONTool.JsonToLayui(projectManagementService.selectProjectAll());
        return result;
    }
    //-------------------------------添加项目-------------------------------
    //添加项目入口
    @RequestMapping("/addProject")
    public String addProject(Map<String,Project> map){
          Project p = new Project();
          map.put("project",p);
          return "addProject";
    }

    /*
    执行添加项目管理操作
     */
    @RequestMapping(value = "/doAddProject",method = RequestMethod.POST)
    public String doAddProject(@ModelAttribute("project") Project project){
        project.setProject_Id(UUID.randomUUID().toString().replaceAll("-",""));
        projectManagementService.insertProject(project);
        return "projectmanagement";
    }
    //---------------------------编辑项目---------------------------------
    //编辑项目入口
    @RequestMapping("/updateProject")
    public String updateProject(HttpServletRequest req ,Map<String, Project> map){
        String project_Id = req.getParameter("project_Id");
        System.out.println(project_Id);
        Project p = new Project();
        p.setProject_Id(project_Id);
        map.put("project",p);
        return "updateProject";
    }
    /*
    执行编辑项目操作
     */
    @RequestMapping(value = "/doUpdateProject",method = RequestMethod.POST)
    public String doUpdateProject(@ModelAttribute("project") Project p){
        System.out.println(p.toString());
        projectManagementService.updateProject(p);
        return "projectmanagement";
    }

}
