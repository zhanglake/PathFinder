package com.zzh.dao;

import com.zzh.entity.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/2.
 */
@Repository
public interface MenuDao {

    List<Menu> selectTopMenuByRoleId(Long id);

    List<Menu> selectSecondaryMenuByRoleIdAndTopMenuId(Long roleId, Long topMenuId);

    List<Menu> selectTopMenus();

    List<Menu> selectSecondaryMenus(Long topMenuId);

    Menu selectOne(Long menuId);

}
