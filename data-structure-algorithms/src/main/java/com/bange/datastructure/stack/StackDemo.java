package com.bange.datastructure.stack;

import java.util.Scanner;

public class StackDemo {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10, new int[10]);

        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("s(show)显示数据");
            System.out.println("e(exit)退出程序");
            System.out.println("a(add)添加");
            System.out.println("g(get)数据");
            key = scanner.next().charAt(0);
            switch (key) {
                case 's':
                    stack.list();
                    break;
                case 'e':
                    flag=false;
                    break;
                case 'a':
                    System.out.print("请输入一个数：");
                    stack.push(scanner.nextInt());
                    break;
                case 'g':
                    System.out.printf("取出数据%d\n",stack.pop());
                    break;

                default:
                    break;
            }
        }
    }
}
