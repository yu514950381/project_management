package com.feima.project_management.dao;


import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("/test4")
public interface testMapper {

    List<Map> testSelect();

}
