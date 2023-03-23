package com.bange.designmode.designmode.observer;

public class WeatherConditions {

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

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
