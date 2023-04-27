package com.bange.designmode.designmode.demo.responsibility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class APPDemo {
    public static void main(String[] args) {

        //设立请求
//        LocalDateTime localDateTime=LocalDateTime.now();
        String date="2023-04-19 00:01:20";
        LocalDateTime dateTime = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        // 设立执行节点
        SecondJudge secondJudge = new SecondJudge("秒");
        MinuteJudge minuteJudge = new MinuteJudge("分");
        HourJudge hourJudge = new HourJudge("时");
        DaysJudge daysJudge = new DaysJudge("天");

        //设置成环状
        secondJudge.setNextJudge(minuteJudge);
        minuteJudge.setNextJudge(hourJudge);
        hourJudge.setNextJudge(daysJudge);
        daysJudge.setNextJudge(secondJudge);
        //流程开始
        String result = secondJudge.processRequest(dateTime);
        System.out.println("==>"+result);

    }
}
