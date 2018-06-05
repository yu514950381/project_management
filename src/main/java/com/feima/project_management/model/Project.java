package com.feima.project_management.model;

import java.util.Date;

public class Project {
    private String Project_Id;
    private String Project_Name;
    private String Project_Type;
    private String Project_Date_Begin;
    private String Project_Date_Over;
    private String Project_Working_Days;
    private String Project_State;
    private String Project_Describe;

    public String getProject_Id() {
        return Project_Id;
    }

    public void setProject_Id(String project_Id) {
        Project_Id = project_Id;
    }

    public String getProject_Name() {
        return Project_Name;
    }

    public void setProject_Name(String project_Name) {
        Project_Name = project_Name;
    }

    public String getProject_Type() {
        return Project_Type;
    }

    public void setProject_Type(String project_Type) {
        Project_Type = project_Type;
    }

    public String getProject_Date_Begin() {
        return Project_Date_Begin;
    }

    public void setProject_Date_Begin(String project_Date_Begin) {
        Project_Date_Begin = project_Date_Begin;
    }

    public String getProject_Date_Over() {
        return Project_Date_Over;
    }

    public void setProject_Date_Over(String project_Date_Over) {
        Project_Date_Over = project_Date_Over;
    }

    public String getProject_Working_Days() {
        return Project_Working_Days;
    }

    public void setProject_Working_Days(String project_Working_Days) {
        Project_Working_Days = project_Working_Days;
    }

    public String getProject_State() {
        return Project_State;
    }

    public void setProject_State(String project_State) {
        Project_State = project_State;
    }

    public String getProject_Describe() {
        return Project_Describe;
    }

    public void setProject_Describe(String project_Describe) {
        Project_Describe = project_Describe;
    }

    @Override
    public String toString() {
        return "Project{" +
                "Project_Id='" + Project_Id + '\'' +
                ", Project_Name='" + Project_Name + '\'' +
                ", Project_Type='" + Project_Type + '\'' +
                ", Project_Date_Begin='" + Project_Date_Begin + '\'' +
                ", Project_Date_Over='" + Project_Date_Over + '\'' +
                ", Project_Working_Days='" + Project_Working_Days + '\'' +
                ", Project_State='" + Project_State + '\'' +
                ", Project_Describe='" + Project_Describe + '\'' +
                '}';
    }
}
