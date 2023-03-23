package com.bange.datastructure.tree.binarysorttree;

public class BinarySortTree {
    SortTreeNode rootSortTreeNode;

    public void setSortTreeNode(SortTreeNode sortTreeNode) {
        this.rootSortTreeNode = sortTreeNode;
    }


    public SortTreeNode findNode(SortTreeNode sortTreeNode) {
        if (rootSortTreeNode != null) {
            return rootSortTreeNode.findNode(sortTreeNode);
        }
        return null;
    }

    public SortTreeNode findParentNode(SortTreeNode sortTreeNode) {
        if (rootSortTreeNode != null) {
            return rootSortTreeNode.findParentNode(sortTreeNode);
        }
        return null;
    }

    /**
     * 删除二叉排序树的最小节点
     * 1.以sortTreeNode为临时跟节点的二叉陪许树
     * 2.删除以sortTreeNode二叉排序树的最小节点，并返回该节点
     *
     * @param sortTreeNode
     * @return
     */
    public SortTreeNode deleteMiniNode(SortTreeNode sortTreeNode) {
        SortTreeNode temp = sortTreeNode;
        // 1.循环查找最小节点
        while (temp.left != null) {
            temp = temp.left;
        }
        // 删除最小的节点
        deleteNode(temp);
        return temp;
    }


    /**
     * 添加节点
     *
     * @param sortTreeNode
     */
    public void add(SortTreeNode sortTreeNode) {
        if (rootSortTreeNode == null) {
            rootSortTreeNode = sortTreeNode;
        } else {
            rootSortTreeNode.add(sortTreeNode);
        }

    }

    public void preOrder() {
        if (rootSortTreeNode == null) {
            System.out.println("树为空不能遍历");
            return;
        }
        rootSortTreeNode.preOrder();
    }

    /**
     * 中序遍历
     */
    public void infixOrder() {
        if (rootSortTreeNode == null) {
            System.out.println("树为空不能遍历");
            return;
        }
        rootSortTreeNode.infixOrder();
    }

    /**
     * 中序遍历
     */
    public void suffixOrder() {
        if (rootSortTreeNode == null) {
            System.out.println("树为空不能遍历");
            return;
        }
        rootSortTreeNode.suffixOrder();
    }

    public void deleteNode(SortTreeNode sortTreeNode) {
        if (rootSortTreeNode == null) {
            return;
        }
        SortTreeNode targetNode = findNode(sortTreeNode);
        if (targetNode != null) {
            // 1.只有root节点，而且root节点就是targetNode
            if (rootSortTreeNode.right == null && rootSortTreeNode.left == null) {
                rootSortTreeNode = null;
                return;
            }
            // 2.查找targetNode的父节点
            SortTreeNode parentNode = findParentNode(sortTreeNode);
            // 3.删除的是叶子节点
            if (targetNode.left == null && targetNode.right == null) {
                if (parentNode.left != null && parentNode.left.number == targetNode.number) {
                    parentNode.left = null;
                } else if (parentNode.right != null && parentNode.right.number == targetNode.number) {
                    parentNode.right = null;
                }
            } else if (targetNode.left != null && targetNode.right != null) {
                // 4.判断targetNode有两颗子节点
                // 4.1 从二叉树的右子树进行查找最小的节点然后删除，并返回该最小节点
                SortTreeNode miniNode = deleteMiniNode(targetNode.right);
                // 4.2 将最小节点替换当前需要删除的目标节点，即为删除了二叉排序树的targetNode
                targetNode.number = miniNode.number;
            } else {
                // 5.判断targetNode只有一颗子节点
                if (targetNode.left != null) {
                    // 5.1 targetNode有左节点
                    if (parentNode != null) {
                        if (parentNode.left.number == targetNode.number) {
                            parentNode.left = targetNode.left;
                        } else {
                            parentNode.right = targetNode.left;
                        }
                    } else {
                        rootSortTreeNode = targetNode.left;
                    }

                } else {
                    // 5.2 targetNode有右节点
                    if (parentNode != null) {
                        if (parentNode.left.number == targetNode.number) {
                            parentNode.left = targetNode.right;
                        } else {
                            parentNode.right = targetNode.right;
                        }
                    } else {
                        rootSortTreeNode = targetNode.left;
                    }


                }

            }

        }


    }


}
