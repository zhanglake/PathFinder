package com.zzh.controller;

import com.zzh.entity.MyFile;
import com.zzh.entity.Result;
import com.zzh.service.MyFileService;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by zhenghua.zhang on 2018/1/15.
 */
@Controller
@RequestMapping("file")
public class MyFileController {

    @Autowired
    private MyFileService myFileService;

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public Result uploadFile(HttpServletRequest request) {
        List<Long> insertFileIds = new ArrayList<Long>();
        ServletContext sc = request.getSession().getServletContext();
        String basePath = sc.getRealPath("/files") + "/";
        File file = new File(basePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (ServletFileUpload.isMultipartContent(request)) {
            DiskFileItemFactory factory = new DiskFileItemFactory();
            factory.setRepository(file);// 指定上传文件的临时目录
            factory.setSizeThreshold(1024000);// 指定在内存中缓存数据大小,单位为byte
            ServletFileUpload upload = new ServletFileUpload(factory);
            upload.setHeaderEncoding("UTF-8");
            upload.setSizeMax(10000000);// 指定一次上传多个文件的总尺寸
            List<FileItem> fileItems = new ArrayList<FileItem>();
            try {
                fileItems = upload.parseRequest(request);
                for (FileItem item : fileItems) {
                    if (!item.isFormField()) {
                        //文件名
                        String fileName = item.getName();
                        //检查文件后缀格式
                        String fileEnd = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
                        //创建文件唯一名称
                        String uuid = UUID.randomUUID().toString();
                        //真实上传路径
                        StringBuffer sbRealPath = new StringBuffer();
                        sbRealPath.append(basePath).append(uuid).append(".").append(fileEnd);
                        StringBuffer showPath = new StringBuffer("files/").append(uuid).append(".").append(fileEnd);
                        //写入文件
                        File thisFile = new File(sbRealPath.toString());
                        item.write(thisFile);
                        MyFile myFile = new MyFile();
                        myFile.setFileName(fileName);
                        myFile.setPath(showPath.toString());
                        myFile.setType(fileEnd.toLowerCase());
                        myFileService.insertOne(myFile);
                        insertFileIds.add(myFile.getFileId());
                    }
                }
            } catch (Exception e1) {
                System.out.println("文件上传发生错误" + e1.getMessage());
            }
        }
        return new Result(insertFileIds);
    }

}
