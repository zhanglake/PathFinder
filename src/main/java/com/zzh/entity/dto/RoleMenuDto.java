package com.zzh.entity.dto;

/**
 * Created by zhenghua.zhang on 2018/1/4.
 */
public class RoleMenuDto {

    private Long roleId;
    private Long menuId;

    public RoleMenuDto (Long roleId, Long menuId) {
        this.roleId = roleId;
        this.menuId = menuId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getRoleId() {

        return roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

}
