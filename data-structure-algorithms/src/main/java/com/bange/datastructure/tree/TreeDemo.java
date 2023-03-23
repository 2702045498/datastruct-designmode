package com.bange.datastructure.tree;

public class TreeDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        HeroNode node1 = new HeroNode(1, "宋江");
        HeroNode node2 = new HeroNode(2, "吴用");
        HeroNode node3 = new HeroNode(3, "卢俊义");
        HeroNode node4 = new HeroNode(4, "林冲");
        HeroNode node5 = new HeroNode(5, "关胜");
        HeroNode node6 = new HeroNode(6, "武松");
        binaryTree.setRootNode(node1);
        binaryTree.rootNode.left = node2;
        binaryTree.rootNode.right = node3;
        node3.right = node4;
        node3.left = node5;
        System.out.println("------前序遍历------");
        binaryTree.preOrder();
        System.out.println("------中序遍历------");
        binaryTree.infixOrder();
        System.out.println("------后序遍历------");
        binaryTree.suffixOrder();

        System.out.println("------分割线------");
        System.out.println("------前序遍历查找指定节点------");
        System.out.println(binaryTree.findNodeByPreOrder(node5));
        System.out.println("------中序遍历查找指定节点------");
        System.out.println(binaryTree.findNodeByInfixOrder(node5));
        System.out.println("------后序遍历查找指定节点------");
        System.out.println(binaryTree.findNodeBySuffixOrder(node5));
        System.out.println("------删除指定节点------");
        binaryTree.delete(node5);
        System.out.println("------前序遍历------");
        binaryTree.preOrder();
        System.out.println("------中序遍历------");
        binaryTree.infixOrder();
        System.out.println("------后序遍历------");
        binaryTree.suffixOrder();
    }
}
