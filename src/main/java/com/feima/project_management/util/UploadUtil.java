package com.feima.project_management.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * @author Layui-风中飘蓝
 * 管理文件上传的通用类
 * */

//
public class UploadUtil {

    public static String uploadFile(MultipartFile file,String path) throws IOException {
        String name = file.getOriginalFilename();
        String suffixName = name.substring(name.lastIndexOf("."));
        String hash = Integer.toHexString(new Random().nextInt());
        String fileName = hash + suffixName;
        File tempFile = new File(path , fileName);
        if(!tempFile.getParentFile().exists()){
            tempFile.getParentFile().mkdir();
        }
        if(tempFile.exists()){
            tempFile.delete();
        }
        tempFile.createNewFile();
        file.transferTo(tempFile);
        return tempFile.getName();
    }

}
