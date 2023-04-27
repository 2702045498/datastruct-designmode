package com.bange.datastructure.tree.demo;

import java.util.ArrayList;
import java.util.List;

public class MenuServiceImpl {


  public List<MenuVO> queryMenuList(){
      List<Menu> menuList = getMenuList();
      List<MenuVO> menuVOList=new ArrayList<>();
      MenuVO menuVO=null;
      for (Menu m:menuList) {
          menuVO=new MenuVO();
          menuVO.setId(m.getId());
          menuVO.setMenuName(m.getMenuName());
          menuVO.setParentId(m.getParentId());
          menuVOList.add(menuVO);
      }
      List<MenuVO> voList = createTree(menuVOList, 0);
      return voList;
  }

 public List<MenuVO> createTree(List<MenuVO> menuVOList,Integer parentId){
      List<MenuVO> tree=new ArrayList<>();
     for (MenuVO m:menuVOList) {
         if(m.getParentId()==parentId){
             m.setChildren(createTree(menuVOList,m.getId()));
             tree.add(m);
         }
     }
      return tree;
 }


public List<Menu> getMenuList(){
    List<Menu> menuList=new ArrayList<>();
    Menu menu1 = new Menu(1, "用户管理", 0);
    Menu menu2 = new Menu(2, "商品管理", 0);
    Menu menu3 = new Menu(3, "系统管理", 0);
    Menu menu4 = new Menu(4, "订单管理", 0);
    Menu menu5 = new Menu(5, "用户列表", 1);
    Menu menu6 = new Menu(6, "部门列表", 1);
    Menu menu7 = new Menu(7, "岗位列表", 1);
    Menu menu8 = new Menu(8, "商品列表", 2);
    Menu menu9 = new Menu(9, "分类列表", 2);
    Menu menu10 = new Menu(10, "品牌列表", 2);
    Menu menu11 = new Menu(11, "角色列表", 3);
    Menu menu12 = new Menu(12, "权限列表", 3);
    Menu menu13 = new Menu(13, "权限列表", 3);
    Menu menu14 = new Menu(14, "订单列表", 4);
    Menu menu15 = new Menu(15, "库存列表", 4);
        menuList.add(menu1);
        menuList.add(menu2);
        menuList.add(menu3);
        menuList.add(menu4);
        menuList.add(menu5);
        menuList.add(menu6);
        menuList.add(menu7);
        menuList.add(menu8);
        menuList.add(menu9);
        menuList.add(menu10);
        menuList.add(menu11);
        menuList.add(menu12);
        menuList.add(menu13);
        menuList.add(menu14);
        menuList.add(menu15);
    return menuList;
}


}
