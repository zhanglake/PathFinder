package com.zzh.entity.dto;

/**
 * Created by zhenghua.zhang on 2017/12/28.
 */
public class UserRoleDto {
    private Long userId;
    private Long roleId;

    public UserRoleDto (Long userId, Long roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getUserId() {

        return userId;
    }

    public Long getRoleId() {
        return roleId;
    }
}
