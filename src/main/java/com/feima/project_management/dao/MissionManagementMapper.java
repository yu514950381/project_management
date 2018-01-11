package com.feima.project_management.dao;

import com.feima.project_management.model.Mission;
import org.springframework.stereotype.Repository;

@Repository("missionManagementMapper")
public interface MissionManagementMapper {

    void missionInsert(Mission mission);

    void missionDeleteByPrimaryKey(Integer missionId);

    void missionupdata(Mission mission);
}
