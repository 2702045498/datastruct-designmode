package com.bange.datastructure.tree;

public class HeroNode {
    public int number;
    public  String name;
    public HeroNode left;
    public  HeroNode right;

    public HeroNode(int number, String name) {
        this.number = number;
        this.name = name;
    }

    /**
     * 前序遍历方式查找
     * @param heroNode
     * @return
     */
    public HeroNode findNodeByPreOrder(HeroNode heroNode){
        // 1.先与当前节点比较，找到则返回
        if(this.number==heroNode.number){
            return this;
        }
        // 2.查找左子树，判断找到返回，否则继续查找右子树
        HeroNode result=null;
        if(this.left!=null){
            result  = this.left.findNodeByPreOrder(heroNode);
            if(result!=null){
                return result;
            }
        }
        // 3.查找右子树，不管找到与否都需返回结束
        if(this.right!=null){
          return  this.right.findNodeByPreOrder(heroNode);
        }
        return null;
    }

    /**
     * 中序遍历方式查找
     * @param heroNode
     * @return
     */
    public HeroNode findNodeByInfixOrder(HeroNode heroNode){
        // 1.查找左子树，判断找到返回，否则继续查找右子树
        HeroNode result=null;
        if(this.left!=null){
            result  = this.left.findNodeByPreOrder(heroNode);
            if(result!=null){
                return result;
            }
        }
        // 2.先与当前节点比较，找到则返回
        if(this.number==heroNode.number){
            return this;
        }
        // 3.查找右子树，不管找到与否都需返回结束
        if(this.right!=null){
            return  this.right.findNodeByPreOrder(heroNode);
        }
        return null;
    }

    /**
     * 后序遍历方式查找
     * @param heroNode
     * @return
     */
    public HeroNode findNodeBySuffixOrder(HeroNode heroNode){
        // 1.查找左子树，判断找到返回，否则继续查找右子树
        HeroNode result=null;
        if(this.left!=null){
            result  = this.left.findNodeByPreOrder(heroNode);
            if(result!=null){
                return result;
            }
        }

        // 3.查找右子树，不管找到与否都需返回结束
        if(this.right!=null){
            result= this.right.findNodeByPreOrder(heroNode);
            if(result!=null){
                return result;
            }
        }
        // 2.先与当前节点比较，找到则返回
        if(this.number==heroNode.number){
            return this;
        }
        return null;
    }



    /**
     * 前序遍历
     */
   public void preOrder(){
       System.out.println(this);
       if(this.left!=null){
           this.left.preOrder();
       }
       if(this.right!=null){
           this.right.preOrder();
       }
   }

    /**
     * 中序遍历
     */
   public void infixOrder(){
       if(this.left!=null){
           this.left.infixOrder();
       }
       System.out.println(this);
       if(this.right!=null){
           this.right.infixOrder();
       }
   }

    /**
     * 后序遍历
     */
   public void  suffixOrder(){
       if(this.left!=null){
           this.left.suffixOrder();
       }
       if(this.right!=null){
           this.right.suffixOrder();
       }
       System.out.println(this);
   }



public void delete(HeroNode heroNode){
    // 1.先判断当前节点的左节点是否为需要删除的节点，是则删除，否则继续递归删除
       if(this.left!=null&&this.left.number==heroNode.number){
           this.left=null;
           return;
       }
       // 2.若是第一个步未找到删除的节点，则进行右子节点的递归删除
       if(this.right!=null&&this.right.number==heroNode.number){
               this.right=null;
               return;
       }
       // 3.左子树递归删除
       if(this.left!=null){
           this.left.delete(heroNode);
       }
        // 4.右子树递归删除
       if(this.right!=null){
           this.right.delete(heroNode);
       }
}





    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("HeroNode{");
        sb.append("number=").append(number);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
