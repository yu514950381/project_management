package com.feima.project_management.controller;

import com.feima.project_management.util.UploadUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/upload")
public class UploadController {


    @RequestMapping("/image")
    public Map<String,Object> image(MultipartFile file, HttpServletRequest req){
        Map<String,Object> map = new HashMap<String,Object>();
        try {
            String path = req.getSession().getServletContext().getRealPath("\\upload\\");//头像文件上传的路径暂时先保存在本地，之后发布的时候再考虑服务器的事情
            String image = UploadUtil.uploadFile(file,path);
            map.put("code",0);
            map.put("image",image);
            map.put("path",path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

}
