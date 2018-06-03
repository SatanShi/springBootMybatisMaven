package com.sdw.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @author SHIDIWEN
 * @create 2018-06-01 20:34
 * @desc 异步任务
 * 应用场景 ：发送短信  发送邮件  APP消息推送 等节约时间提升效率
 **/
@Component
public class AsyncTask {
    @Async  //注释了就变同步任务
    public Future<Boolean> doTask11() throws InterruptedException {
        long start =System.currentTimeMillis();
        Thread.sleep(1000);
        long end =System.currentTimeMillis();
        System.out.println("任务1耗时:"+(end - start)+"毫秒");
        return new AsyncResult<>(true);
    }

    @Async
    public Future<Boolean> doTask22() throws InterruptedException {
        long start =System.currentTimeMillis();
        Thread.sleep(700);
        long end =System.currentTimeMillis();
        System.out.println("任务2耗时:"+(end - start)+"毫秒");
        return new AsyncResult<>(true);
    }

    @Async
    public Future<Boolean> doTask33() throws InterruptedException {
        long start =System.currentTimeMillis();
        Thread.sleep(600);
        long end =System.currentTimeMillis();
        System.out.println("任务3耗时:"+(end - start)+"毫秒");
        return new AsyncResult<>(true);
    }
}
