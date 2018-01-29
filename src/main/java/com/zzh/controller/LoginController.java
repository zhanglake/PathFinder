package com.zzh.controller;

import com.zzh.entity.Result;
import com.zzh.entity.User;
import com.zzh.entity.dto.LoginDto;
import com.zzh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhenghua.zhang on 2018/1/26.
 */
@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/back", method = RequestMethod.POST)
    @ResponseBody
    public Result login(@RequestBody LoginDto dto) {
        User user = userService.selectForLogin(dto);
        if (null == user) {
            return new Result(600, Result.ResultStatus.ERROR, "登陆失败，用户名或密码错误", null);
        }
        if (user.getLocked()) {
            return new Result(700, Result.ResultStatus.ERROR, "登陆失败，用户已被锁定", null);
        }
        return new Result("登录成功", user);
    }

}