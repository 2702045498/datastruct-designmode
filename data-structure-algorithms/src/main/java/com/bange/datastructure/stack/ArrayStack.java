package com.bange.datastructure.stack;

public class ArrayStack {
    public  int maxSize;
    public  int[] data;
    public  int top=-1; //栈顶

    public ArrayStack(int maxSize, int[] data) {
        this.maxSize = maxSize;
        this.data = data;
    }


    public boolean isFull(){
        return top==maxSize;
    }

    public  boolean isEmpty(){
        return top==-1;
    }

    public void push(int val){
        if(isFull()){
            System.out.println("栈已满！");
            return;
        }
        top++;
        data[top]=val;

    }

    public int pop(){
        if(isEmpty()){
           throw  new RuntimeException("没有数据!");
        }
        int data = this.data[top];
        top--;
        return data;
    }


    public void  list(){
        if(isEmpty()){
            System.out.println("没有数据!");
            return;
        }
        for (int i = top; i >-1 ; i--) {
            System.out.printf("data[%d]=%d \n",i,data[i]);
        }



    }

}
