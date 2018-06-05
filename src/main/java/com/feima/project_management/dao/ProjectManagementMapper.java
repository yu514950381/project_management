package com.feima.project_management.dao;

import com.feima.project_management.model.Project;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


/**
 * @author 李立国
 * 项目管理的测试dao类
 * 之后会将正式的功能上传到本类中
 * */

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

    /**
     * 删除数据
     * @param p
     */
    void deleteProject(Project p);

    /**
     * 修改数据
     * @param p
     */
    void updateProject(Project p);
}
