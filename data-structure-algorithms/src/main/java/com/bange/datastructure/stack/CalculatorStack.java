package com.bange.datastructure.stack;


public class CalculatorStack {
    public int maxSize;
    public int[] data;
    public int top;

    public CalculatorStack(int maxSize) {
        this.maxSize = maxSize;
        this.data = new int[maxSize];
        this.top = -1;
    }

    /**
     * 查看栈顶的值
     * @return
     */
    public int peek(){
        return data[top];
    }

    /**
     * 列出栈中的所有数据
     */
    public void list(){
        if(isEmpty()){
            System.out.println("栈中暂无数据!");
            return;
        }
        for (int i = top; i >-1; i--) {
            System.out.printf("数据：data[%d]=%d\n",i,data[i]);
        }
    }


    /**
     * 取出数据
     * @return
     */
    public int pop(){
        if(isEmpty()){
            throw  new RuntimeException("栈为空，不能取数据");
        }
        int el = data[top];
        top--;
        return el;
    }


    /**
     * 添加数据
     * @param value 传入的数据
     */
    public void push(int value) {
        if (isFull()) {
            System.out.println("栈已满，不能再添加数据！");
            return;
        }
        top++;
        data[top]=value;
    }

    public boolean isFull() {
        return top == maxSize;
    }

    public boolean isEmpty() {
        return top == -1;
    }

}
