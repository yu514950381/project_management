package com.feima.project_management.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.feima.project_management.service.MemberManagementService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/memberManagementCtrl")
public class MemberManagementCtrl {

    @Resource(name = "/memberManagementService")
    private MemberManagementService MemberManagementService;

    @RequestMapping("/showAll")
    public String showAll() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonfromList = mapper.writeValueAsString(this.MemberManagementService.selectAll());
        String result="{\n" +
                "  \"code\": 0,\n" +
                "  \"msg\": \"\",\n" +
                "  \"count\": 1000,\n" +
                "  \"data\": "+jsonfromList+"\n" +
                "}";
        return result;
    }

    @RequestMapping("/infoInsert")
    public ModelAndView infoInsert(ModelAndView mv){
        for(int i = 1;i<1000;i++){
            Map<String,Object> student = new HashMap<>();
            student.put("username","姓名"+i);
            student.put("position","职务"+i);
            student.put("mission","任务"+i);
            student.put("remark","备注"+i);
            this.MemberManagementService.testInsert(student);
        }
        mv.setViewName("index");
        return mv;

    }
}
