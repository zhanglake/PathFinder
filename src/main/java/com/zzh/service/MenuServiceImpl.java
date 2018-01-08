package com.zzh.service;

import com.zzh.dao.MenuDao;
import com.zzh.entity.Menu;
import com.zzh.entity.dto.MenuDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/2.
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;

    @Override
    public List<Menu> selectTopMenuByRoleId(Long id) {
        List<Menu> menus = menuDao.selectTopMenuByRoleId(id);
        return menus;
    }

    @Override
    public List<Menu> selectSecondaryMenuByRoleIdAndTopMenuId(Long roleId, Long topMenuId) {
        List<Menu> menus = menuDao.selectSecondaryMenuByRoleIdAndTopMenuId(roleId, topMenuId);
        return menus;
    }

    @Override
    public List<MenuDto> selectMenuTree() {
        List<MenuDto> dtos = new ArrayList<MenuDto>();
        List<Menu> topMenus = menuDao.selectTopMenus();
        for (Menu topMenu : topMenus) {
            MenuDto dto = new MenuDto();
            dto.setMenu(topMenu);
            List<Menu> childrenMenus = menuDao.selectSecondaryMenus(topMenu.getMenuId());
            dto.setChildrenMenus(childrenMenus);
            dtos.add(dto);
        }
        return dtos;
    }

    @Override
    public Menu selectOne(Long menuId) {
        return menuDao.selectOne(menuId);
    }

}
