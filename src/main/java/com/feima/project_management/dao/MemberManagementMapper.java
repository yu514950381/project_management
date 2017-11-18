package com.feima.project_management.dao;


import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("/memberManagementMapper")
public interface MemberManagementMapper {

    List<Map> testSelect();

    void testInsert(Map map);

}
