package com.zzh.entity.dto;

/**
 * Created by zhenghua.zhang on 2018/1/26.
 */
public class LoginDto {

    private String name;
    private String password;

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {

        return name;
    }

    public String getPassword() {
        return password;
    }

}
