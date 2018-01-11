package com.feima.project_management.controller;


import com.feima.project_management.service.LoginAndRegisterService;
import com.feima.project_management.util.PasswordScurity;
import com.feima.project_management.util.RequestTool;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.UUID;

/**
 * @author 喻世琦
 * 登录注册的controller层
 * */


@RestController
@RequestMapping("/loginAndRegisterCtrl")
public class LoginAndRegisterCtrl {

    @Resource(name = "/loginAndRegisterService")
    private LoginAndRegisterService loginAndRegisterService;
    //登录
    @RequestMapping("/login")
    public void login(HttpServletRequest req, HttpServletResponse rep) throws JSONException {
        String loginname=req.getParameter("loginname");
        Map user=this.loginAndRegisterService.select(loginname);
        JSONObject resultMap=new JSONObject();//直接用json对象来存放返回值，方便回带
        resultMap.put("errorCode",0);//返回代码，0表示可以正常登录，-1表示无此用户，1表示密码错误
        try {
            if(user==null){//用户不存在的情况
                resultMap.put("errorCode",-1);
            }else{
                String password=req.getParameter("password");
                if(!password.equals(user.get("User_Password"))){//密码错误
                    resultMap.put("errorCode",1);
                }
            }
            rep.getWriter().write(resultMap.toString());//将错误代码以json的格式传回前台
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    //初步注册
    @RequestMapping("/register")
    public void register(HttpServletRequest req, HttpServletResponse rep) throws JSONException {
        String loginname=req.getParameter("loginname");
        Map user=this.loginAndRegisterService.select(loginname);
        JSONObject resultMap=new JSONObject();//直接用json对象来存放返回值，方便回带
        resultMap.put("errorCode",0);//返回代码，0表示可以正常登录，-1表示无此用户，1表示密码错误
        try {
            if(user!=null){
                resultMap.put("errorCode",-1);//如果返回值不为空，则表示已经存在该用户，返回错误代码-1
            }
            rep.getWriter().write(resultMap.toString());//将错误代码以json的格式传回前台
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    //前往完善信息页面
    @RequestMapping("/toComplete")
    public ModelAndView toComplete(HttpServletRequest req,ModelAndView mv){
        mv.setViewName("otherInfo");
        String loginname = req.getParameter("loginname");
        String password = PasswordScurity.scurity(req.getParameter("password"));
        req.getSession().setAttribute("loginname",loginname);
        req.getSession().setAttribute("password",password);
        return mv;
    }

    //完善全部信息
    @RequestMapping("/start")
    public ModelAndView start(HttpServletRequest req,ModelAndView mv){
        mv.setViewName("missionManagement");
        String loginname = (String) req.getSession().getAttribute("loginname");
        String password =(String) req.getSession().getAttribute("password");
        Map user = RequestTool.getParameterMap(req);
        user.put("loginname",loginname);
        user.put("password",password);
        this.loginAndRegisterService.addUser(user);
        return mv;
    }

}
