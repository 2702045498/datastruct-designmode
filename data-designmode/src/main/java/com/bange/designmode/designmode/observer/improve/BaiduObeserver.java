package com.bange.designmode.designmode.observer.improve;

public class BaiduObeserver implements IWeatherObserver {

    private  float temperature;
    private float  pressure;
    private float humidity;


    public void  updateWeather(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

public void display(){
    System.out.println("度网temperature:"+this.temperature);
    System.out.println("度网pressure:"+this.pressure);
    System.out.println("度网humidity:"+this.humidity);
}

}
