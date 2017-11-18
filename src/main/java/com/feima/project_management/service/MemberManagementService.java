package com.feima.project_management.service;

import com.feima.project_management.dao.MemberManagementMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("/memberManagementService")
public class MemberManagementService {

    @Resource(name="/memberManagementMapper")
    private MemberManagementMapper MemberManagementMapper;

    public List<Map> selectAll(){
        return this.MemberManagementMapper.testSelect();
    }

    public void testInsert(Map map){
        this.MemberManagementMapper.testInsert(map);
    }

}
