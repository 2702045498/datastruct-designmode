package com.bange.designmode.designmode.observer.improve;

public class BangeNetObeserver implements IWeatherObserver {

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
    System.out.println("temperature:"+this.temperature);
    System.out.println("pressure:"+this.pressure);
    System.out.println("humidity:"+this.humidity);
}

}
