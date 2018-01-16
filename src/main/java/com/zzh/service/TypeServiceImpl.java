package com.zzh.service;

import com.zzh.dao.TypeDao;
import com.zzh.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/16.
 */
@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeDao typeDao;

    @Override
    public List<Type> findAll() {
        List<Type> types = typeDao.findAll();
        return types;
    }

}
