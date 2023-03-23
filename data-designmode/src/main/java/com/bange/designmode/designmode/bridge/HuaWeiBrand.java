package com.bange.designmode.designmode.bridge;

public class HuaWeiBrand implements Brand{
    @Override
    public void takePhotos() {
        System.out.println("华为手机拍照");
    }

    @Override
    public void useWeiXin() {
        System.out.println("华为手机使用微信");
    }

    @Override
    public void sendEmail() {
        System.out.println("华为手机发送邮件");
    }
}
