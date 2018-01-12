package com.feima.project_management.service;


import com.feima.project_management.dao.MissionManagementMapper;
import com.feima.project_management.model.Mission;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("/missionManagementService")
public class MisssionManagementService {

    @Resource(name="missionManagementMapper")
    private MissionManagementMapper missionManagementMapper;

    public void missionInsert(Mission mission){
        this.missionManagementMapper.missionInsert(mission);
    }

    public void missiondeleteById(Integer missionId){
        this.missionManagementMapper.missionDeleteByPrimaryKey(missionId);
    }

    public void missionUpdata(Mission mission){
        this.missionManagementMapper.missionupdata(mission);
    }

    public List<Map> missionselect(Map map){
        return this.missionManagementMapper.missionselect();
    }

}
