package com.zzh.controller;

import com.zzh.entity.Page;
import com.zzh.entity.Result;
import com.zzh.entity.Role;
import com.zzh.entity.dto.RoleSaveDto;
import com.zzh.entity.dto.TableRequest;
import com.zzh.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2017/12/27.
 */
@Controller
@RequestMapping("role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/one/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result findOne(@PathVariable Long id) {
        Role role = roleService.findOne(id);
        return new Result(role);
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Page findList(@RequestBody TableRequest tableRequest) {
        Page<Role> rolePage = new Page<Role>(tableRequest.getPageSize(), tableRequest.getPageNumber());;
        if (null != tableRequest.getParam()) {
            rolePage = roleService.findListByStatus(rolePage, tableRequest.getParam());
        } else {
            rolePage = roleService.findList(rolePage);
        }
        return rolePage;
    }

    @RequestMapping(value = "/select", method = RequestMethod.GET)
    @ResponseBody
    public Result selectList() {
        List<Role> roles = roleService.selectList();
        return new Result(roles);
    }

    @RequestMapping(value = "/select", method = RequestMethod.POST)
    @ResponseBody
    public Result selectListWithQuery(@RequestBody String queryParam) {
        List<Role> roles = roleService.selectListWithQuery(queryParam);
        return new Result(roles);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result deleteRole(@PathVariable Long id) {
        roleService.deleteRole(id);
        return new Result("删除成功");
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Result updateOne(@RequestBody RoleSaveDto dto) {
        roleService.updateOne(dto);
        return new Result("修改成功");
    }

}
