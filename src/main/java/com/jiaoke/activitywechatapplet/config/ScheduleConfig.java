package com.jiaoke.activitywechatapplet.config;

import com.jiaoke.activitywechatapplet.dao.ActivityMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * @Author: Hongtao
 * @Date: 2019/3/28 13:48
 * @Description:
 */
@Configuration/**1.主要用于标记配置类，兼备Component的效果。*/
@EnableScheduling /**2.开启定时任务*/
public class ScheduleConfig {

    private Logger logger = LoggerFactory.getLogger(ScheduleConfig.class);

    @Resource
    private ActivityMapper activityMapper;
    /**3.添加定时任务*/
    @Scheduled(cron = "0 1 0 * * ? ")
    private void activityStatusTasks() {

        activityMapper.updateStatusForRegistration();
        activityMapper.updateStatusForPreparing();
        activityMapper.updateStatusForProcessing();
        activityMapper.updateStatusForEnd();
        logger.info("执行定时任务1: " + LocalDateTime.now());
    }
}
