package com.bange.designmode.designmode.bridge;

public class MiBrand  implements Brand{
    @Override
    public void takePhotos() {
        System.out.println("小米手机拍照");
    }

    @Override
    public void useWeiXin() {
        System.out.println("小米手机使用微信");
    }

    @Override
    public void sendEmail() {
        System.out.println("小米手机发送邮件");
    }
}
