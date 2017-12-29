package com.zzh.dao;

import com.zzh.entity.Page;
import com.zzh.entity.Role;
import com.zzh.entity.dto.RoleSaveDto;
import com.zzh.entity.dto.SelectPageDto;
import com.zzh.entity.dto.UserRoleDto;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2017/12/27.
 */
@Repository
public interface RoleDao {

    Role findOne(Long id);

    Integer findCount();

    List<Role> findList(Page page);

    Integer findCountByStatus(Boolean available);

    List<Role> findListByStatus(SelectPageDto dto);

    List<Role> selectList();

    List<Role> selectListWithQuery(String queryParam);

    void deleteRole(Long id);

    void updateOne(RoleSaveDto dto);

}
