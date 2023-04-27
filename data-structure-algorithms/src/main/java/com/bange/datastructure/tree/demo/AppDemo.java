package com.bange.datastructure.tree.demo;

import java.util.List;

public class AppDemo {
    public static void main(String[] args) {
        MenuServiceImpl menuService = new MenuServiceImpl();
        List<MenuVO> menuVOList = menuService.queryMenuList();
        menuVOList.stream().forEach(item->{
            System.out.println(item);
        });
    }
}
