package com.zzh.entity;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2017/12/20.
 */
public class User extends BaseEntity {
    private Long userId;
    private String userName;
    private String password;
    private String salt;
    private Boolean locked;
    private Organization organization;
    private List<Role> roles;

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {

        return roles;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Organization getOrganization() {

        return organization;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Long getUserId() {

        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getSalt() {
        return salt;
    }

    public Boolean getLocked() {
        return locked;
    }
}
