package com.bange.designmode.designmode.observer.improve;



import java.util.ArrayList;
import java.util.List;

public class WeatherData implements IWeatherSubject {
    private float temperature;
    private float pressure;
    private float humidity;
    // 多个观察者
    private List<IWeatherObserver> weatherObserverList;
    // 构造函数--进行初始化
    public WeatherData() {
        weatherObserverList=new ArrayList<>();
    }

    public void dataChange() {
        // 推送更新的数据
        notifyObserver();
    }
// 当数据有更新时就setData()
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }


    @Override
    public void registerObserver(IWeatherObserver observer) {
        weatherObserverList.add(observer);
    }

    @Override
    public void removeRegisterObserver(IWeatherObserver observer) {
        if(weatherObserverList.contains(observer)){
            weatherObserverList.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (IWeatherObserver observer:weatherObserverList) {
            observer.updateWeather(this.temperature,this.pressure,this.humidity);
        }
    }





}
