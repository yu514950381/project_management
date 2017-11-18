package com.feima.project_management.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.feima.project_management.service.MemberManagementService;
import com.feima.project_management.util.JSONTool;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/memberManagementCtrl")
public class MemberManagementCtrl {

    @Resource(name = "/memberManagementService")
    private MemberManagementService MemberManagementService;

    @RequestMapping("/showAll")
    public String showAll() throws JsonProcessingException {
        String result  = JSONTool.JsonToLayui(this.MemberManagementService.selectAll());
        return result;
    }
//    给数据库填充大量数据方便进行测试使用
//    @RequestMapping("/infoInsert")
//    public ModelAndView infoInsert(ModelAndView mv){
//        for(int i = 1;i<1000;i++){
//            Map<String,Object> student = new HashMap<>();
//            student.put("username","姓名"+i);
//            student.put("position","职务"+i);
//            student.put("mission","任务"+i);
//            student.put("remark","备注"+i);
//            this.MemberManagementService.testInsert(student);
//        }
//        mv.setViewName("index");
//        return mv;
//
//    }
}
