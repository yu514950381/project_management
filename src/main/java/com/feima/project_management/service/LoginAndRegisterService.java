package com.feima.project_management.service;

import com.feima.project_management.dao.LoginAndRegisterMapper;
import com.feima.project_management.dao.MemberManagementMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 喻世琦
 * 登录注册的server层
 * */


@Service("/loginAndRegisterService")
public class LoginAndRegisterService {

    @Resource(name="/loginAndRegisterMapper")
    private LoginAndRegisterMapper loginAndRegisterMapper;

    public Map select(String loginName){
        return this.loginAndRegisterMapper.select(loginName);
    }

    public void addUser(Map map){
        this.loginAndRegisterMapper.addUser(map);
    }


}
