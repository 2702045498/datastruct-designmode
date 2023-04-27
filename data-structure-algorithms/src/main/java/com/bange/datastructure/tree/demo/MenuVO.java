package com.bange.datastructure.tree.demo;

import java.util.ArrayList;
import java.util.List;

public class MenuVO {
    private Integer id;
    private String MenuName;
    private Integer parentId;
    private List<MenuVO> children=new ArrayList<>();

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

    public List<MenuVO> getChildren() {
        return children;
    }

    public void setChildren(List<MenuVO> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MenuVO{");
        sb.append("id=").append(id);
        sb.append(", MenuName='").append(MenuName).append('\'');
        sb.append(", parentId=").append(parentId);
        sb.append(", children=").append(children);
        sb.append('}');
        return sb.toString();
    }
}
