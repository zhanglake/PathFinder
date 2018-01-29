package com.zzh.service;

import com.zzh.entity.Page;
import com.zzh.entity.User;
import com.zzh.entity.dto.LoginDto;
import com.zzh.entity.dto.UserSaveDto;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2017/12/20.
 */
public interface UserService {

    User findOne(Long id);

    User findOneWithDetail(Long id);

    Page<User> findList(Page page);

    Page<User> findListByStatus(Page page, Object param);

    void deleteOne(Long userId);

    void resetPwd();

    void updateOne(UserSaveDto dto);

    void deleteUserRole(Long userId);

    void insertUserRole(Long userId, List<Long> roleIds);

    User selectForLogin(LoginDto dto);

}