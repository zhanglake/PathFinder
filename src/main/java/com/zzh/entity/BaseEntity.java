package com.zzh.entity;

import java.util.Date;

/**
 * Created by zhenghua.zhang on 2017/12/20.
 */
public class BaseEntity {
    private Date createdDate = new Date();
    private String createdBy = "系统";
    private Date modifiedDate = new Date();
    private String modifiedBy = "系统";
    private Boolean deleted = Boolean.FALSE;

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean getDeleted() {

        return deleted;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getCreatedDate() {

        return createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }
}
