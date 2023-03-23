package com.bange.designmode.designmode.observer;

public class WeatherData {
    private float temperature;
    private float pressure;
    private float humidity;
    private WeatherConditions weatherConditions;

    public WeatherData(WeatherConditions weatherConditions) {
        this.weatherConditions = weatherConditions;
    }

    public void dataChange() {
        // 推送更新的数据
        weatherConditions.updateWeather(temperature, pressure, humidity);
    }
// 当数据有更新时就setData()
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
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
