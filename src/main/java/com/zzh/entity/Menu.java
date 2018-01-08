package com.zzh.entity;

/**
 * Created by zhenghua.zhang on 2018/1/2.
 */
public class Menu {

    private Long menuId;
    private String menuName;
    private String path;
    private Integer sort;
    private Long parentId;
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getParentId() {

        return parentId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Long getMenuId() {

        return menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public String getPath() {
        return path;
    }

    public Integer getSort() {
        return sort;
    }

}
