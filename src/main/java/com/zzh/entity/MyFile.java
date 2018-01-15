package com.zzh.entity;

/**
 * Created by zhenghua.zhang on 2018/1/15.
 */
public class MyFile {

    private Long fileId;
    private String fileName;
    private String type;
    private String path;
    private String description;

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getFileId() {

        return fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public String getType() {
        return type;
    }

    public String getPath() {
        return path;
    }

    public String getDescription() {
        return description;
    }
}
