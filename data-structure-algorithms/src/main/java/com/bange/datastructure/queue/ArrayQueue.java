package com.bange.datastructure.queue;

import java.util.Queue;

/**
 * 数组模拟队列---存在一个问题，当队列满了之后，取出一个数据，数据取出后，不能再次添加数据
 */
public class ArrayQueue {
    private int maxSize; // 队列最大容量
    private int front ; // 队列头
    private int rear ;  //队列尾
    private int[] arr;  // 数组用于存放数据，模拟队列


    //构造方法并初始化
    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.front=-1; // -1表示指向队列头部（指向队列头的第一个数据的前一个位置）
        this.rear=-1;   // -1表示执行队列尾部--指向队尾的数据（队列的最后一个数据）
        arr=new int[maxSize];
    }

    //判断队列是否满
    public boolean isFull(){
        return this.rear==maxSize-1;
    }
    //判断队列是否空
    public boolean isEmpty(){
        return this.rear==this.front;
    }

    // 添加数据
    public void addQueue(int n){
        if(isFull()){
            System.out.println("队列已满，不能添加数据！");
            return ;
        }
        this.rear++;
        arr[this.rear]=n;
    }

    //  取出数据
    public  int getQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列为空，不能取数据！");
        }
        this.front++;
        return arr[this.front];
    }

    // 显示队列所所有数据
    public  void showQueue(){
        if(isEmpty()){
            System.out.println("队列为空");
            return;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }

    //显示队列头数据--不是取数据
    public int headQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列为空，不能取数据！");
        }
        return arr[front+1];
    }

}
