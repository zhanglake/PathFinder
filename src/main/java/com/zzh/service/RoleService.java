package com.zzh.service;

import com.zzh.entity.Page;
import com.zzh.entity.Role;
import com.zzh.entity.dto.RoleSaveDto;
import com.zzh.entity.dto.UserRoleDto;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2017/12/27.
 */
public interface RoleService {

    Role findOne(Long id);

    Page<Role> findList(Page page);

    Page<Role> findListByStatus(Page page, Object param);

    List<Role> selectList();

    List<Role> selectListWithQuery(String queryParam);

    void deleteRole(Long id);

    void updateOne(RoleSaveDto dto);

}
