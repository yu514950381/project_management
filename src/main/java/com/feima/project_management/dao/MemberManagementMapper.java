package com.feima.project_management.dao;


import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author 喻世琦
 * 项目成员管理的测试dao类
 * 之后会将正式的功能上传到本类中
 * */

@Repository("/memberManagementMapper")
public interface MemberManagementMapper {

    List<Map> initSelect(Map map);


}
