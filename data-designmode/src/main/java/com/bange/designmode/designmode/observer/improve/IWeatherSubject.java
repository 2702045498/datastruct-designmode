package com.bange.designmode.designmode.observer.improve;
// 观察者接口
public interface IWeatherSubject {
    // 注册一个观察者
    void registerObserver(IWeatherObserver observer);
    // 移除一个观察者
    void removeRegisterObserver(IWeatherObserver observer);
    // 通知所有观察者
    void notifyObserver();
}
