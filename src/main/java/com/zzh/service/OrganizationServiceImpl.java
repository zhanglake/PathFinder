package com.zzh.service;

import com.zzh.dao.OrganizationDao;
import com.zzh.entity.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2017/12/27.
 */
@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrganizationDao organizationDao;

    @Override
    public List<Organization> selectList() {
        List<Organization> organizations = organizationDao.selectList();
        return organizations;
    }

}
