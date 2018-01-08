package com.zzh.service;

import com.zzh.entity.Menu;
import com.zzh.entity.dto.MenuDto;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/2.
 */
public interface MenuService {

    List<Menu> selectTopMenuByRoleId(Long id);

    List<Menu> selectSecondaryMenuByRoleIdAndTopMenuId(Long roleId, Long topMenuId);

    List<MenuDto> selectMenuTree();

    Menu selectOne(Long menuId);

}