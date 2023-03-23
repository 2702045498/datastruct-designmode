package com.bange.designmode.designmode.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        HuaWeiBrand huaWeiBrand = new HuaWeiBrand();
        FlatStyle flatStyle = new FlatStyle(huaWeiBrand);
        flatStyle.useWeiXin();
        flatStyle.takePhotos();
        flatStyle.sendEmail();

        System.out.println("-----------");
        MiBrand miBrand = new MiBrand();
        FoldStyle foldStyle = new FoldStyle(miBrand);
        foldStyle.takePhotos();


    }
}
