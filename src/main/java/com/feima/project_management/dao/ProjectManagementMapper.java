package com.feima.project_management.dao;

import com.feima.project_management.model.Project;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("/projectManagementMapper")
public interface ProjectManagementMapper {
    /**
     * 查询全部
     * @return
     */
    List<Map> selectProjectAll();

    /**
     * 条件查询
     * @param p
     * @return
     */
    List<Map> selectProJect(Project p);

    /**
     * 插入
     * @param p
     */
    void insertProject(Project p);
}
