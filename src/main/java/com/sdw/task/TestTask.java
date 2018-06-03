package com.sdw.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author SHIDIWEN
 * @create 2018-06-01 20:07
 * @desc 定时任务类
 **/
@Component
public class TestTask {
    private static final SimpleDateFormat dateFormat =new SimpleDateFormat("HH:mm:ss");
    //定时任务
    //指定每隔x秒执行      毫秒
    @Scheduled(fixedRate = 3000)
    public void reportCurrentTime(){
        System.out.println("第一个定时任务");
    }
    //定时任务表达式生成地址 http://cron.qqe2.com  年不支持
    @Scheduled(cron = "0/2 * * * * ?")
    public void reportCurrentTime2(){
        System.out.println("第二个定时任务");
    }
}
