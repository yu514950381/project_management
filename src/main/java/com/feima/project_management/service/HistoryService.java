package com.feima.project_management.service;

import com.feima.project_management.dao.HistoryMapper;
import com.feima.project_management.dao.MemberManagementMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 喻世琦
 * 项目动态记录的测试Service类
 * 之后会将正式的功能上传到本类中
 * */

@Service("/historyService")
public class HistoryService {

    @Resource(name="/historyMapper")
    private HistoryMapper historyMapper;

    public List<Map> selectAll(){
        return this.historyMapper.testSelect();
    }


}
