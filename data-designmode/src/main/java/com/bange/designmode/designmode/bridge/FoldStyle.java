package com.bange.designmode.designmode.bridge;

public class FoldStyle extends AbstractPhoneStyle {
    public FoldStyle(Brand brand) {
        super(brand);
    }

    @Override
    void takePhotos() {
        super.takePhotos();
        System.out.println("折叠式手机拍照");
    }

    @Override
    void useWeiXin() {
        super.useWeiXin();
        System.out.println("折叠式手机使用微信");
    }

    @Override
    void sendEmail() {
        super.sendEmail();
        System.out.println("折叠式手机发送邮件");
    }
}
