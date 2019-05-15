package com.qhit.FileUpload;

import com.qhit.utils.Upload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.List;
import java.util.Map;

/** 
* Created by GeneratorCode on 2019/05/08
*/ 

@RestController 
@RequestMapping("/shopInfo") 
public class ShopInfoController { 


    @Autowired
    Upload upload;


    @RequestMapping("/upload")
    public String  upload(HttpServletRequest request,HttpServletResponse response) throws Exception {
        //调用文件上传的方法返回一个文件的绝对路径+文件的名称的字符串
        String s = upload.handleFileUpload(request, response);
        String[] split = s.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        return split[0]+split[1];
    }


    @RequestMapping("/download")
    public String downloadFile(HttpServletRequest request, HttpServletResponse response) {
        String fileName = "aim_test.txt";// 设置文件名，根据业务需要替换成要下载的文件名
        if (fileName != null) {
            //设置文件路径
            String realPath = "D://aim//";
             File file = new File(realPath , fileName);
            if (file.exists()) {
                response.setContentType("application/force-download");// 设置强制下载不打开
                response.addHeader("Content-Disposition", "attachment;fileName=" + fileName);// 设置文件名
                byte[] buffer = new byte[1024];
                FileInputStream fis = null;
                BufferedInputStream bis = null;
                try {
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);
                    OutputStream os = response.getOutputStream();
                    int i = bis.read(buffer);
                    while (i != -1) {
                        os.write(buffer, 0, i);
                        i = bis.read(buffer);
                    }
                    System.out.println("success");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (bis != null) {
                        try {
                            bis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return null;
    }


} 
