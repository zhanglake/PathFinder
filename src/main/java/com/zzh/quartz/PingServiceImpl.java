package com.zzh.quartz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhenghua.zhang on 2018/2/9.
 */
@Service
public class PingServiceImpl implements PingService {

    @Autowired
    private PingDao pingDao;

    @Override
    public void pingSql() throws Exception{
        pingDao.pingSql();
    }

}
