package com.feima.project_management.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class JSONTool {

    private static ObjectMapper mapper = new ObjectMapper();


    public static String JsonToLayui(List list){
        try {
            String jsonfromList = mapper.writeValueAsString(list);
            String result="{\n" +
                    "  \"code\": 0,\n" +
                    "  \"msg\": \"\",\n" +
                    "  \"count\": 1000,\n" +
                    "  \"data\": "+jsonfromList+"\n" +
                    "}";
            return result;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }

}
