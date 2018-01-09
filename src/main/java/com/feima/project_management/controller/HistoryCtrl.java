package com.feima.project_management.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.feima.project_management.service.HistoryService;
import com.feima.project_management.service.MemberManagementService;
import com.feima.project_management.util.JSONTool;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @author 喻世琦
 * 项目动态记录的测试Ctr类
 * 之后会将正式的功能上传到本类中
 * */


@RestController
@RequestMapping("/historyCtrl")
public class HistoryCtrl {

    @Resource(name = "/historyService")
    private HistoryService historyService;

    @RequestMapping("/showAll")
    public String showAll() throws JsonProcessingException {
        String result  = JSONTool.JsonToLayui(this.historyService.selectAll());
        return result;
    }
    //给数据库填充大量数据方便进行测试使用
//    @RequestMapping("/infoInsert")
//    public ModelAndView infoInsert(ModelAndView mv){
//        for(int i = 1;i<1000;i++){
//            Map<String,Object> student = new HashMap<>();
//            student.put("id","id"+i);
//            student.put("LoginName","登录名"+i);
//            student.put("Password","密码"+i);
//            student.put("Username","用户名"+i);
//            student.put("Truename","真实姓名"+i);
//            student.put("Tel",i);
//            student.put("QQ",i);
//            student.put("Email","邮箱"+i);
//            student.put("Sex","性别"+i);
//            student.put("Img","头像"+i);
//            this.MemberManagementService.testInsert(student);
//        }
//        mv.setViewName("index");
//        return mv;
//
//    }

    @RequestMapping("/test1")
    public ModelAndView test(ModelAndView mv){
        mv.setViewName("test1");
        return mv;
    }

}
