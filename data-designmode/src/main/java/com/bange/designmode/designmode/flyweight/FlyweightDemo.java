package com.bange.designmode.designmode.flyweight;

public class FlyweightDemo {
    public static void main(String[] args) {
        WebSiteFactory siteFactory = new WebSiteFactory();
        WebSite webSite = siteFactory.getWebSite("新闻");
        webSite.use(new User("tom"));
        WebSite webSite1 = siteFactory.getWebSite("博客");
      webSite1.use(new User("rose"));
    }
}
