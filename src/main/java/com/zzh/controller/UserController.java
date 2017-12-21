package com.zzh.controller;

import com.zzh.entity.Result;
import com.zzh.entity.User;
import com.zzh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhenghua.zhang on 2017/12/20.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/one/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result findOne(@PathVariable("id") Long id) {
        User user = userService.findOne(id);
        return new Result(user);
    }

}
