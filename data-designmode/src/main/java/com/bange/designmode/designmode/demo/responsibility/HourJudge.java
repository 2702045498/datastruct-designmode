package com.bange.designmode.designmode.demo.responsibility;

import java.time.Duration;
import java.time.LocalDateTime;

public class HourJudge extends TimeJudgeAbstract{
    public HourJudge(String name) {
        super(name);
    }

    @Override
    String processRequest(LocalDateTime localDateTime) {
        LocalDateTime now = LocalDateTime.now();
        Duration between = Duration.between(localDateTime,now );
        long millis = between.toHours();
        if(millis>0 && millis<=1){
            return "一小时内";
        }else {
         return    nextJudge.processRequest(localDateTime);
        }

    }
}
