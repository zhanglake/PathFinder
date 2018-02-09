package com.zzh.quartz;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by zhenghua.zhang on 2018/2/9.
 */
@Component
public class SqlPingTask {
    Logger logger = Logger.getLogger(SqlPingTask.class);

    @Autowired
    private PingService pingService;

    @Scheduled(cron = "0 0/60 * * * ?")
    public void pingSql() {
        logger.info("----quartz----开始执行定时ping数据库任务----");
        try {
            pingService.pingSql();
        } catch (Exception e) {
            logger.error("----quartz----定时ping数据库任务执行异常----");
            logger.error(e.getMessage());
        }
        logger.info("----quartz----定时ping数据库任务执行结束----");
    }

}