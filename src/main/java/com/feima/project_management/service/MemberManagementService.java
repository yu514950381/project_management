package com.feima.project_management.service;

import com.feima.project_management.dao.MemberManagementMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 喻世琦
 * 项目成员管理的测试Server类
 * 之后会将正式的功能上传到本类中
 * */


@Service("/memberManagementService")
public class MemberManagementService {

    @Resource(name="/memberManagementMapper")
    private MemberManagementMapper memberManagementMapper;

    public List<Map> initSelect(Map map){
        return this.memberManagementMapper.initSelect(map);
    }

}
