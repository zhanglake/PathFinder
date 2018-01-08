package com.zzh.controller;

import com.zzh.dao.MenuDao;
import com.zzh.entity.Menu;
import com.zzh.entity.Result;
import com.zzh.entity.dto.MenuDto;
import com.zzh.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/2.
 */
@Controller
@RequestMapping("menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/top/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result findTopMenus(@PathVariable Long id) {
        List<Menu> menus = menuService.selectTopMenuByRoleId(id);
        return new Result(menus);
    }

    @RequestMapping(value = "/secondary/{roleId}/{topMenuId}", method = RequestMethod.GET)
    @ResponseBody
    public Result findSecondaryMenus(@PathVariable Long roleId, @PathVariable Long topMenuId) {
        List<Menu> menus = menuService.selectSecondaryMenuByRoleIdAndTopMenuId(roleId, topMenuId);
        return new Result(menus);
    }

    @RequestMapping(value = "/tree", method = RequestMethod.GET)
    @ResponseBody
    public Result findMenuTree() {
        List<MenuDto> menuDtos = menuService.selectMenuTree();
        return new Result(menuDtos);
    }

    @RequestMapping(value = "/one/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result findOne(@PathVariable Long id){
        Menu menu = menuService.selectOne(id);
        return new Result(menu);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Result findList() {
        return new Result();
    }

}
