package com.zzh.service;

import com.zzh.entity.User;

/**
 * Created by zhenghua.zhang on 2017/12/20.
 */
public interface UserService {

    User findOne(Long id);

    User findOneWithDetail(Long id);
}