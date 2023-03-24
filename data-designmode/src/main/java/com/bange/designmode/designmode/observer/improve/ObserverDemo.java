package com.bange.designmode.designmode.observer.improve;



public class ObserverDemo {
    public static void main(String[] args) {
        IWeatherObserver bangeNetObeserver = new BangeNetObeserver();
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(bangeNetObeserver);
        weatherData.setData(19.0f,20.0f,50.0f);
        BaiduObeserver baiduObeserver = new BaiduObeserver();
        weatherData.registerObserver(baiduObeserver);
        weatherData.notifyObserver();
    }

}
