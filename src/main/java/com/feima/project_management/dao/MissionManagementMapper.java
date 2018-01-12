package com.feima.project_management.dao;

import com.feima.project_management.model.Mission;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("missionManagementMapper")
public interface MissionManagementMapper {

    void missionInsert(Mission mission);

    void missionDeleteByPrimaryKey(Integer missionId);

    void missionUpdata(Mission mission);

    List<Map> missionSelect();
}
