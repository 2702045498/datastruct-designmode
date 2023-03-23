package com.bange.datastructure.linkedlist;

import java.util.ArrayList;

public class SingleLinkedList {
    //初始化头节点，头节点不存放数据
  HeroNode headNode=  new HeroNode(0,null,null);


    /**
     * 添加节点
     * 思路：1、不考虑编号的顺序时，找到链表的最后一个节点
     *      2、将最后节点next指向下一个节点
     * @param heroNode
     */
  public void add(HeroNode heroNode){
      // 1.将头节点只保存到一个临时节点，因为头节点不能改变
      HeroNode temp=this.headNode;
      // 2.遍历所有节点，知道最后节点
      while (true){
          if(temp.next==null){
              break;
          }
          temp=temp.next;
      }
      // 3.将最后节点指向新节点
      temp.next=heroNode;

  }
  //按
  public void addByOrder(HeroNode heroNode){
      HeroNode temp=this.headNode;
      boolean flag=false;
      while (true){
          if(temp.next==null){
                break;
          }
          // 编号已经存在
          if(temp.next.number==heroNode.number){
              flag=true;
              break;
          }
          //找到编号位置
          if(temp.next.number>heroNode.number){
              break;
          }
          temp=temp.next;
      }
      if(flag){
          System.out.printf("编号[number=%d]已经存在，不能添加节点\n",heroNode.number);
      }else {
          //添加节点到当前节点的后面
          heroNode.next=temp.next;
          temp.next=heroNode;
      }


  }


  public void update(HeroNode heroNode){
      // 判断是否为空
      if(headNode.next==null){
          System.out.println("链表为空，不能修改！");
      }
      HeroNode temp=headNode.next;
      boolean flag=false; //是否找到的标志
      while (true){
          if(temp.next==null){
              break;
          }
          if(temp.number==heroNode.number){
              flag=true;
              break;
          }
          temp=temp.next;
      }
      // 找到节点
      if(flag){
          temp.name=heroNode.name;
          temp.nickName=heroNode.nickName;
      }else{
          System.out.printf("没有找到[%d]编号的节点，不能修改\n",headNode.number);
      }

  }

  public void delete(int num){
      if(headNode.next==null){
          System.out.println("链表为空不能删除");
          return;
      }
      HeroNode temp=headNode;
      boolean flag=false;
      while (true){
          if(temp.next==null){
              break;
          }
          if(temp.next.number==num){
              flag=true;
              break;
          }
          temp=temp.next;
      }
      if(flag){
         temp.next= temp.next.next;
      }else{
          System.out.printf("没有找到[%d]编号的节点，不能删除",num);
      }

  }



    /**
     * 显示链表
     */
  public void list(){
      //判断是否为空
      if(headNode.next==null){
          System.out.println("链表为空！");
          return;
      }
      //遍历，借助一个辅助临时节点
      HeroNode temp=headNode;
      while (true){
          if(temp.next==null){
              break;
          }
          // 打印每一个节点
          System.out.println(temp.next);
          // 节点后移
          temp=temp.next;
      }
  }


}
