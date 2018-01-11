package com.feima.project_management.dao;

import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @author 喻世琦
 * 该类的作用是对应登录和注册时对数据库需要进行的操作
 * 对应的mapper为loginAndRegisterMapper.xml
 * */
@Repository("/loginAndRegisterMapper")
public interface LoginAndRegisterMapper {

     Map select(String loginName);

    void addUser(Map map);
}
