package com.zzh.entity.dto;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2017/12/29.
 */
public class RoleSaveDto {
    private Long roleId;
    private String roleName;
    private String description;
    private Boolean available;
    private List<Long> menus;

    public void setMenus(List<Long> menus) {
        this.menus = menus;
    }

    public List<Long> getMenus() {

        return menus;
    }

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
