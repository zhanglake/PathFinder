package com.zzh.service;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zzh.dao.UserDao;
import com.zzh.entity.Page;
import com.zzh.entity.User;
import com.zzh.entity.dto.SelectPageDto;
import com.zzh.entity.dto.UserRoleDto;
import com.zzh.entity.dto.UserSaveDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhenghua.zhang on 2017/12/20.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findOne(Long id) {
        return userDao.findOne(id);
    }

    @Override
    public User findOneWithDetail(Long id) {
        return userDao.findOneWithDetail(id);
    }

    @Override
    public Page<User> findList(Page page) {
        Integer count = userDao.findCount();
        List<User> userList = userDao.findList(new Page(page.getPageSize(), page.getPageNo() - 1));
        page.setTotalRecord(count);
        page.setResults(userList);
        return page;
    }

    @Override
    public Page<User> findListByStatus(Page page, Object param) {
        SelectPageDto pageDto = new SelectPageDto(page.getPageSize(), page.getPageNo() - 1, param);
        Integer count = userDao.findCountByStatus((Boolean) param);
        List<User> userList = userDao.findListByStatus(pageDto);
        page.setTotalRecord(count);
        page.setResults(userList);
        return page;
    }

    @Override
    public void deleteOne(Long userId) {
        userDao.deleteOne(userId);
    }

    @Override
    public void resetPwd() {
        userDao.resetPwd();
    }

    @Override
    public void updateOne(UserSaveDto dto) {
        userDao.updateOne(dto);
    }

    @Override
    public void deleteUserRole(Long userId) {
        userDao.deleteUserRole(userId);
    }

    @Override
    public void insertUserRole(Long userId, List<Long> roleIds) {
        List<UserRoleDto> dtos = new ArrayList<UserRoleDto>();
        for (Long roleId : roleIds) {
            UserRoleDto dto = new UserRoleDto(userId, roleId);
            dtos.add(dto);
        }
        userDao.insertUserRole(dtos);
    }

}
