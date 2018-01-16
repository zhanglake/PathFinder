package com.zzh.dao;

import com.zzh.entity.Type;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/16.
 */
@Repository
public interface TypeDao {

    List<Type> findAll();

}
