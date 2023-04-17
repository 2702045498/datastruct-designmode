package com.bange.designmode;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int lenght=15;
        int a=lenght%7;
        System.out.println("a="+a);

        String dateStr1 = "2022-02-28";
        Date date1 = DateUtil.parse(dateStr1);

        String dateStr2 = "2023-03-01";
        Date date2 = DateUtil.parse(dateStr2);
        long betweenDay = DateUtil.between(date1, date2, DateUnit.DAY);
        System.out.println("days="+betweenDay);

        long ti = System.currentTimeMillis();
        System.out.println("=ti=>"+ti);

        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(ti), ZoneId.systemDefault());
        System.out.println("l==="+localDateTime2);
        LocalDate localDate2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(ti), ZoneId.systemDefault()).toLocalDate();
        System.out.println("localDate=="+localDate2);
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDateTime localDateTime = LocalDateTime.parse("2019-07-31 00:00:00", dateTimeFormatter1);
        LocalDate localDate = LocalDate.parse("2019-07-31", dateTimeFormatter2);
        Date date = Date.from(LocalDateTime.parse("2019-07-31 00:00:00", dateTimeFormatter1).atZone(ZoneId.systemDefault()).toInstant());

        long datetolong = localDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
        System.out.println("datetolong:"+datetolong);

    }
}
