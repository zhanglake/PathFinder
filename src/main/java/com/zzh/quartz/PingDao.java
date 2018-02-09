package com.zzh.quartz;

import org.springframework.stereotype.Repository;

/**
 * Created by zhenghua.zhang on 2018/2/9.
 */
@Repository
public interface PingDao {

    void pingSql();

}
