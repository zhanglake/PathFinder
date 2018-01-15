package com.zzh.service;

import com.zzh.entity.MyFile;

/**
 * Created by zhenghua.zhang on 2018/1/15.
 */
public interface MyFileService {

    MyFile findOne(Long id);

    void insertOne(MyFile file);

}
