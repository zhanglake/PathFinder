package com.zzh.entity;

/**
 * Created by zhenghua.zhang on 2017/12/20.
 */
public class Organization extends BaseEntity {
    private Long orgId;
    private String orgName;
    private Long parentOrgId;

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public void setParentOrgId(Long parentOrgId) {
        this.parentOrgId = parentOrgId;
    }

    public Long getOrgId() {

        return orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public Long getParentOrgId() {
        return parentOrgId;
    }
}
