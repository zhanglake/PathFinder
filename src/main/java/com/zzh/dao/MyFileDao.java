package com.zzh.dao;

import com.zzh.entity.MyFile;
import org.springframework.stereotype.Repository;

/**
 * Created by zhenghua.zhang on 2018/1/15.
 */
@Repository
public interface MyFileDao {

    MyFile findOne(Long fileId);

    void insertOne(MyFile myFile);

}
