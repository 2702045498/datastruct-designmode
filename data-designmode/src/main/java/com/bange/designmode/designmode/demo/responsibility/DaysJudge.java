package com.bange.designmode.designmode.demo.responsibility;

import java.time.Duration;
import java.time.LocalDateTime;

public class DaysJudge extends TimeJudgeAbstract{
    public DaysJudge(String name) {
        super(name);
    }

    @Override
    String processRequest(LocalDateTime localDateTime) {
        LocalDateTime now = LocalDateTime.now();
        Duration between = Duration.between( localDateTime,now);
        long millis = between.toDays();
        if(millis>0&& millis<=1){
            return "一天内";
        }else {
            return   nextJudge.processRequest(localDateTime);
        }

    }
}
