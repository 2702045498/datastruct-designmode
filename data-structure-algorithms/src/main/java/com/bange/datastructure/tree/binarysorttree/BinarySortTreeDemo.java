package com.bange.datastructure.tree.binarysorttree;

public class BinarySortTreeDemo {
    public static void main(String[] args) {
        BinarySortTree binarySortTree = new BinarySortTree();
//        int[] arr={7,3,10,12,5,1,9,2};
        int[] arr={7,3};
        for (int i = 0; i <arr.length ; i++) {
          binarySortTree.add(  new SortTreeNode(arr[i]));
        }

        System.out.println("----------前序遍历----------");
        binarySortTree.preOrder();
        System.out.println("----------中序遍历----------");
        binarySortTree.infixOrder();
        System.out.println("----------后序遍历----------");
        binarySortTree.suffixOrder();

        System.out.println("----------删除叶子节点----------");
        binarySortTree.deleteNode(new SortTreeNode(7));

        System.out.println("----------中序遍历----------");
        binarySortTree.infixOrder();
    }


}
