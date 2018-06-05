package com.feima.project_management.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.feima.project_management.service.MemberManagementService;
import com.feima.project_management.util.JSONTool;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 喻世琦
 * 项目成员管理的测试Ctr类
 * 之后会将正式的功能上传到本类中
 * */


@RestController
@RequestMapping("/memberManagementCtrl")
public class MemberManagementCtrl {

    @Resource(name = "/memberManagementService")
    private MemberManagementService memberManagementService;

    @RequestMapping("/init")
    public ModelAndView init(ModelAndView mv, HttpServletRequest req){
        String Project_Id = req.getParameter("projectId");
        String User_Id = req.getSession().getAttribute("User_Id").toString();
        Map param = new HashMap();
        param.put("Project_Id",Project_Id);
        List<Map> result = this.memberManagementService.initSelect(param);
        return mv;

    }

}
