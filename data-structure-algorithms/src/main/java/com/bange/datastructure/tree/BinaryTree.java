package com.bange.datastructure.tree;

public class BinaryTree {

    public HeroNode rootNode;

    public void setRootNode(HeroNode rootNode) {
        this.rootNode = rootNode;
    }

    /**
     * 前序遍历查找指定节点
     *
     * @param heroNode
     * @return
     */
    public HeroNode findNodeByPreOrder(HeroNode heroNode) {
        if (this.rootNode != null) {
            return this.rootNode.findNodeByPreOrder(heroNode);
        }
        return null;
    }

    /**
     * 中序遍历查找指定节点
     *
     * @param heroNode
     * @return
     */
    public HeroNode findNodeByInfixOrder(HeroNode heroNode) {
        if (this.rootNode != null) {
            return this.rootNode.findNodeByInfixOrder(heroNode);
        }
        return null;
    }

    /**
     * 后序遍历查找指定节点
     *
     * @param heroNode
     * @return
     */
    public HeroNode findNodeBySuffixOrder(HeroNode heroNode) {
        if (this.rootNode != null) {
            return this.rootNode.findNodeBySuffixOrder(heroNode);
        }
        return null;
    }


    public void preOrder() {
        if (this.rootNode != null) {
            this.rootNode.preOrder();
        } else {
            System.out.println("前序遍历二叉树为空！");
        }
    }

    public void infixOrder() {
        if (this.rootNode != null) {
            this.rootNode.infixOrder();
        } else {
            System.out.println("中序遍历二叉树为空！");
        }
    }

    public void suffixOrder() {
        if (this.rootNode != null) {
            this.rootNode.suffixOrder();
        } else {
            System.out.println("后序遍历二叉树为空！");
        }
    }

    /**
     * 删除节点
     * @param heroNode
     */
    public void delete(HeroNode heroNode) {
        if (this.rootNode != null) {
            if (this.rootNode.number == heroNode.number) {
                this.rootNode = null;
                return;
            } else {
                this.rootNode.delete(heroNode);
            }
        } else {
            System.out.println("这是空树不能进行删除操作");
        }

    }

}
