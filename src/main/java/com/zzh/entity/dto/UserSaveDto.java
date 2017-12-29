package com.zzh.entity.dto;

import com.zzh.entity.Organization;
import com.zzh.entity.Role;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2017/12/28.
 */
public class UserSaveDto {
    private Long userId;
    private String userName;
    private Boolean locked;
    private Long organizationId;
    private List<Long> roleIds;

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public void setRoleIds(List<Long> roleIds) {
        this.roleIds = roleIds;
    }

    public Long getUserId() {

        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public Boolean getLocked() {
        return locked;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public List<Long> getRoleIds() {
        return roleIds;
    }
}
