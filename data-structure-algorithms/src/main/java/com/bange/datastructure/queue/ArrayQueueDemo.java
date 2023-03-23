package com.bange.datastructure.queue;

import java.util.Scanner;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("s(show)显示队列");
            System.out.println("e(exit)退出队列");
            System.out.println("a(add)添加数据");
            System.out.println("g(get)取出数据");
            System.out.println("h(head)查看头数据");
            key = scanner.next().charAt(0);
            switch (key) {
                case 's':
                    arrayQueue.showQueue();
                    break;
                case 'e':
                    flag=false;
//                    System.exit(0);
                    break;
                case 'a':
                    System.out.print("请输入一个数：");
                    arrayQueue.addQueue(scanner.nextInt());
                    break;
                case 'g':
                    System.out.printf("取出数据%d\n",arrayQueue.getQueue());
                    break;
                case 'h':
                    System.out.printf("查看队列头数据%d\n",arrayQueue.headQueue());
                    break;
                default:
                    break;
            }
        }
    }
}
