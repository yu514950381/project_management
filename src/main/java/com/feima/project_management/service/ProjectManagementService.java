package com.feima.project_management.service;

import com.feima.project_management.dao.ProjectManagementMapper;
import com.feima.project_management.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
/**
 * @author 李立国
 * 项目管理的测试Server类
 *
 * */
@Service("/projectManagementService")
public class ProjectManagementService {

    @Resource(name="/projectManagementMapper")
    private ProjectManagementMapper projectManagementMapper;

    /**
     * 查询数据
     * @return查询到的数据存放到map集合中
     */
    public List<Map> selectProjectAll(){
        return projectManagementMapper.selectProjectAll();
    }

    /**
     * 增加数据
     * @param
     */
    public void insertProject(Project p){
        projectManagementMapper.insertProject(p);
    }

    /**
     * 编辑数据
     * @param p
     */
    public void updateProject(Project p){ projectManagementMapper.updateProject(p);}
}
