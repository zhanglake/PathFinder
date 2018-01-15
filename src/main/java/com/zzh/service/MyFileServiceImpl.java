package com.zzh.service;

import com.zzh.dao.MyFileDao;
import com.zzh.entity.MyFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhenghua.zhang on 2018/1/15.
 */
@Service
public class MyFileServiceImpl implements MyFileService {

    @Autowired
    private MyFileDao myFileDao;

    @Override
    public MyFile findOne(Long id) {
        MyFile file = myFileDao.findOne(id);
        return file;
    }

    @Override
    public void insertOne(MyFile file) {
        myFileDao.insertOne(file);
    }

}
