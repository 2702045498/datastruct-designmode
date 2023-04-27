package com.bange.designmode.designmode.demo.responsibility;

import java.time.LocalDateTime;

public abstract class TimeJudgeAbstract {

    TimeJudgeAbstract nextJudge;
    String name;

    public TimeJudgeAbstract(String name) {
        this.name = name;
    }

    public void setNextJudge(TimeJudgeAbstract nextJudge) {
        this.nextJudge = nextJudge;
    }

    abstract String processRequest(LocalDateTime localDateTime);

}
