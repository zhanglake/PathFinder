package com.zzh.service;

import com.zzh.dao.UserDao;
import com.zzh.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
