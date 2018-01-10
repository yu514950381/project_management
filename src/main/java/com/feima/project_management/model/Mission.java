package com.feima.project_management.model;

import java.util.Date;

public class Mission {
    private String Mission_Id;
    private String Mission_Name;
    private String Mission_Details;
    private String Mission_Role;
    private Date Mission_Date_Begin;
    private Date Mission_Date_Over;

    public String getMission_Id() {
        return Mission_Id;
    }

    public void setMission_Id(String mission_Id) {
        Mission_Id = mission_Id;
    }

    public String getMission_Name() {
        return Mission_Name;
    }

    public void setMission_Name(String mission_Name) {
        Mission_Name = mission_Name;
    }

    public String getMission_Details() {
        return Mission_Details;
    }

    public void setMission_Details(String mission_Details) {
        Mission_Details = mission_Details;
    }

    public String getMission_Role() {
        return Mission_Role;
    }

    public void setMission_Role(String mission_Role) {
        Mission_Role = mission_Role;
    }

    public Date getMission_Date_Begin() {
        return Mission_Date_Begin;
    }

    public void setMission_Date_Begin(Date mission_Date_Begin) {
        Mission_Date_Begin = mission_Date_Begin;
    }

    public Date getMission_Date_Over() {
        return Mission_Date_Over;
    }

    public void setMission_Date_Over(Date mission_Date_Over) {
        Mission_Date_Over = mission_Date_Over;
    }

}
