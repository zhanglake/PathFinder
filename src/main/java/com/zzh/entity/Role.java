package com.zzh.entity;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2017/12/20.
 */
public class Role extends BaseEntity {
    private Long roleId;
    private String roleName;
    private String description;
//    private List<Resource> resources;
    private Boolean available = Boolean.FALSE;

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Long getRoleId() {

        return roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getAvailable() {
        return available;
    }
}
