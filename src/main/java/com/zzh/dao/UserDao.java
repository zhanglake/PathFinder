package com.zzh.dao;

import com.zzh.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by zhenghua.zhang on 2017/12/20.
 */
@Repository
public interface UserDao {

    User findOne(Long id);

    User findOneWithDetail(Long id);

}
