package com.bange.datastructure.tree.demo;



public class Menu {
    private Integer id;
    private String MenuName;
    private Integer parentId;

    public Menu() {
    }

    public Menu(Integer id, String menuName, Integer parentId) {
        this.id = id;
        MenuName = menuName;
        this.parentId = parentId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuName() {
        return MenuName;
    }

    public void setMenuName(String menuName) {
        MenuName = menuName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }


}
