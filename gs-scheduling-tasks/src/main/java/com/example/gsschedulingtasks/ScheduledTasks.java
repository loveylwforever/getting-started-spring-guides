package com.example.gsschedulingtasks;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Slf4j
public class ScheduledTasks {

    // 固定频率 5 秒
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        log.info("计划任务 -> 定时 5s 刷新 -> 当前时间: {}", LocalDateTime.now());
    }

    @Scheduled(cron = "* * * * * ?")
    public void cronExpressionTask(){
        log.info("计划任务 -> cron表达式(每秒钟) -> 当前时间: {}", LocalDateTime.now());
    }
}
