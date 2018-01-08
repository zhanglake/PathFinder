package com.zzh.entity.dto;

import com.zzh.entity.Menu;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/2.
 */
public class MenuDto {

    private Menu menu;
    private List<Menu> childrenMenus;

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void setChildrenMenus(List<Menu> childrenMenus) {
        this.childrenMenus = childrenMenus;
    }

    public Menu getMenu() {

        return menu;
    }

    public List<Menu> getChildrenMenus() {
        return childrenMenus;
    }

}
