package com.bange.datastructure.queue;

// 数组模拟环形队列进行优化
public class CircleQueue {

    private int maxSize; // 队列最大容量
    // front 就是指向队列的第一个元素，也就是arr[front]就是队列的第一个元素。front的初始值=0
    private int front;
    // rear指向队列的最后一个元素的后一个位置，因为希望空出一个作为约定，
    // rear的初始值=0
    private int rear;  //队列尾
    private int[] arr;  // 数组用于存放数据，模拟队列


    //构造方法并初始化
    public CircleQueue(int maxSize) {
        this.maxSize = maxSize;
        this.front = 0; // front的初始值=0
        this.rear = 0;   //  rear的初始值=0
        arr = new int[maxSize];
    }

    //判断队列是否满
    public boolean isFull() {
        return (this.rear + 1) % maxSize == this.front;
    }

    //判断队列是否空
    public boolean isEmpty() {
        return this.rear == this.front;
    }

    // 添加数据
    public void addQueue(int n) {
        if (isFull()) {
            System.out.println("队列已满，不能添加数据！");
            return;
        }
        // 直接添加数据
        arr[this.rear] = n;
        // rear后移
        this.rear = (this.rear + 1) % maxSize;
    }

    //  取出数据
    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，不能取数据！");
        }
        // 1.将front指向的当前的数据，保存到临时变量中（因为直接返回front无法后移）
        // 2.front后移，考虑取模
        // 3.返回零时变量的值
        int value = arr[front];
        this.front = (this.front + 1) % maxSize;
        return value;
    }

    //计算当前有效数字
    public int size() {
        return (this.rear + maxSize - this.front) % maxSize;
    }

    // 显示队列所所有数据
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列为空");
            return;
        }
        for (int i = 0; i < front + size(); i++) {
            System.out.printf("arr[%d]=%d\n", i % maxSize, arr[i % maxSize]);
        }
    }

    //显示队列头数据--不是取数据
    public int headQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，不能取数据！");
        }
        return arr[front];
    }
}
