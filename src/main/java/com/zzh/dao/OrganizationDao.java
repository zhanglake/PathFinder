package com.zzh.dao;

import com.zzh.entity.Organization;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2017/12/27.
 */
@Repository
public interface OrganizationDao {

    List<Organization> selectList();

}
