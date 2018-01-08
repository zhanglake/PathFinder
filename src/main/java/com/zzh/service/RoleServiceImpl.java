package com.zzh.service;

import com.zzh.dao.RoleDao;
import com.zzh.entity.Page;
import com.zzh.entity.Role;
import com.zzh.entity.dto.RoleMenuDto;
import com.zzh.entity.dto.RoleSaveDto;
import com.zzh.entity.dto.SelectPageDto;
import com.zzh.entity.dto.UserRoleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhenghua.zhang on 2017/12/27.
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public Role findOne(Long id) {
        Role role = roleDao.findOne(id);
        return role;
    }

    @Override
    public Page<Role> findList(Page page) {
        Integer count = roleDao.findCount();
        List<Role> roles = roleDao.findList(new Page(page.getPageSize(), page.getPageNo() - 1));
        page.setResults(roles);
        page.setTotalRecord(count);
        return page;
    }

    @Override
    public Page<Role> findListByStatus(Page page, Object param) {
        SelectPageDto pageDto = new SelectPageDto(page.getPageSize(), page.getPageNo() - 1, param);
        Integer count = roleDao.findCountByStatus((Boolean) param);
        List<Role> roles = roleDao.findListByStatus(pageDto);
        page.setResults(roles);
        page.setTotalRecord(count);
        return page;
    }

    @Override
    public List<Role> selectList() {
        List<Role> roles = roleDao.selectList();
        return roles;
    }

    @Override
    public List<Role> selectListWithQuery(String queryParam) {
        List<Role> roles = roleDao.selectListWithQuery(queryParam);
        return roles;
    }

    @Override
    public void deleteRole(Long id) {
        roleDao.deleteRole(id);
    }

    @Override
    public void updateOne(RoleSaveDto dto) {
        List<Long> menuIds = dto.getMenus();
        List<RoleMenuDto> dtos = new ArrayList<RoleMenuDto>();
        for (Long menuId : menuIds) {
            RoleMenuDto roleMenuDto = new RoleMenuDto(dto.getRoleId(), menuId);
            dtos.add(roleMenuDto);
        }
        // 删除原来的role-menu关联
        roleDao.deleteRoleMenu(dto.getRoleId());
        // 插入role-menu关联
        roleDao.insertRoleMenu(dtos);
        // 修改角色
        roleDao.updateOne(dto);
    }

}
