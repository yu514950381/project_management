package com.feima.project_management.service;

import com.feima.project_management.dao.ProjectManagementMapper;
import com.feima.project_management.model.Project;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("/projectManagementService")
public class ProjectManagementService {
    @Resource(name = "/projectManagementMapper")
    private ProjectManagementMapper projectManagementMapper;

    public List<Map> selectProjectAll(){
        return projectManagementMapper.selectProjectAll();
    }

    public void insertProject(Project p){
        projectManagementMapper.insertProject(p);
    }
}
