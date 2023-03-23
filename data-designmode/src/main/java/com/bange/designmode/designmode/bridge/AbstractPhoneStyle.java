package com.bange.designmode.designmode.bridge;
/**
 * 手机款式
 * 桥接模式
 */
public abstract class AbstractPhoneStyle {
    // 组合品牌接口
    private Brand brand;
    public AbstractPhoneStyle(Brand brand) {
        this.brand = brand;
    }

    void takePhotos(){
        brand.takePhotos();
    };
    void useWeiXin(){
        brand.useWeiXin();
    };
    void sendEmail(){
        brand.sendEmail();
    };


}
