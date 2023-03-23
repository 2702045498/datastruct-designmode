package com.bange.datastructure.tree.binarysorttree;

public class SortTreeNode {
    public int number;
    public SortTreeNode left;
    public SortTreeNode right;

    public SortTreeNode(int number) {
        this.number = number;
    }

    /**
     * 查找要删除的节点的父节点
     *
     * @param sortTreeNode
     * @return
     */
    public SortTreeNode findParentNode(SortTreeNode sortTreeNode) {

        if (this.left != null && sortTreeNode.number == this.left.number ||
                this.right != null && sortTreeNode.number == this.right.number) {
            return this;
        } else {
            if (this.left != null && sortTreeNode.number < this.number) {
                return this.left.findParentNode(sortTreeNode);
            } else if (this.right != null && sortTreeNode.number >= this.number) {
                return this.right.findParentNode(sortTreeNode);
            }else {
                return null;
            }
        }
    }


    /**
     * 查找二叉排序树的节点
     *
     * @param sortTreeNode
     * @return
     */
    public SortTreeNode findNode(SortTreeNode sortTreeNode) {
        if (this.number == sortTreeNode.number) {
            return this;
        } else if (sortTreeNode.number < this.number) {
            if (this.left != null) {
                return this.left.findNode(sortTreeNode);
            }
        } else {
            if (this.right != null) {
                return this.right.findNode(sortTreeNode);
            }
        }
        return null;
    }


    /**
     * 二叉排序树添加数据
     *
     * @param sortTreeNode
     */
    public void add(SortTreeNode sortTreeNode) {
        if (sortTreeNode == null) {
            return;
        }
        if (this != null && sortTreeNode.number < this.number) {
            if (this.left == null) {
                this.left = sortTreeNode;
            } else {
                //递归左子树添加
                this.left.add(sortTreeNode);
            }
        } else {
            if (this.right == null) {
                this.right = sortTreeNode;
            } else {
                this.right.add(sortTreeNode);
            }
        }

    }

    /**
     * 前序遍历
     */
    public void preOrder() {
        if (this == null) {
            System.out.println("==>树为空");
        }
        System.out.println(this);
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null) {
            this.right.preOrder();
        }
    }

    /**
     * 中序遍历
     */
    public void infixOrder() {
        if (this == null) {
            System.out.println("==>树为空");
        }
        if (this.left != null) {
            this.left.infixOrder();
        }
        System.out.println(this);
        if (this.right != null) {
            this.right.infixOrder();
        }
    }

    /**
     * 后序遍历
     */
    public void suffixOrder() {
        if (this == null) {
            System.out.println("==>树为空");
        }
        if (this.left != null) {
            this.left.suffixOrder();
        }
        if (this.right != null) {
            this.right.suffixOrder();
        }
        System.out.println(this);
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SortTreeNode{");
        sb.append("number=").append(number);
        sb.append('}');
        return sb.toString();
    }
}
