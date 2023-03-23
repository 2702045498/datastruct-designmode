package com.bange.designmode.designmode.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        // 接入方
        WeatherConditions weatherConditions = new WeatherConditions();
        // 数据网站--设置数据并传入接入方WeatherConditions
        WeatherData weatherData = new WeatherData(weatherConditions);
        // 更新数据方法
        weatherData.setData(18.00f,20.00f,35.0f);
        System.out.println("==>执行完成");
    }

}
