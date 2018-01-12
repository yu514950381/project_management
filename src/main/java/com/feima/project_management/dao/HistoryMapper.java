package com.feima.project_management.dao;


import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author 喻世琦
 * 项目动态记录的测试dao类
 * 之后会将正式的功能上传到本类中
 * */

@Repository("/historyMapper")
public interface HistoryMapper {

    List<Map> testSelect();


}
