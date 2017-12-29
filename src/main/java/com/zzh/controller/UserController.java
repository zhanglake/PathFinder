package com.zzh.controller;

import com.zzh.entity.Page;
import com.zzh.entity.Result;
import com.zzh.entity.User;
import com.zzh.entity.dto.TableRequest;
import com.zzh.entity.dto.UserSaveDto;
import com.zzh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
        User user = userService.findOneWithDetail(id);
        return new Result(user);
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Page findList(@RequestBody TableRequest tableRequest) {
        Page<User> userPage = new Page<User>(tableRequest.getPageSize(), tableRequest.getPageNumber());
        if (null != tableRequest.getParam()) {
            userPage = userService.findListByStatus(userPage, tableRequest.getParam());
        } else {
            userPage = userService.findList(userPage);
        }
        return userPage;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result deleteOne(@PathVariable("id") Long id) {
        userService.deleteOne(id);
        return new Result("删除成功");
    }

    @RequestMapping(value = "/resetPwd", method = RequestMethod.GET)
    @ResponseBody
    public Result resetPwd() {
        userService.resetPwd();
        return new Result("用户密码重置成功");
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Result updateOne(@RequestBody UserSaveDto dto) {
        // 保存user信息
        userService.updateOne(dto);
        // 删除user-role信息
        userService.deleteUserRole(dto.getUserId());
        // 保存user-role信息
        userService.insertUserRole(dto.getUserId(), dto.getRoleIds());
        return new Result("修改成功");
    }

}
