package com.bange.designmode.designmode.bridge;

public class FlatStyle  extends AbstractPhoneStyle{
    public FlatStyle(Brand brand) {
        super(brand);
    }

    @Override
    void takePhotos() {
        super.takePhotos();
        System.out.println("平板手机拍照");
    }

    @Override
    void useWeiXin() {
        super.useWeiXin();
        System.out.println("平板手机使用微信");
    }

    @Override
    void sendEmail() {
        super.sendEmail();
        System.out.println("平板手机发送邮件");
    }
}
