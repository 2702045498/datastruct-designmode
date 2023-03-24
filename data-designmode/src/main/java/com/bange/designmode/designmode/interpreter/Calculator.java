package com.bange.designmode.designmode.interpreter;

import java.util.Map;
import java.util.Stack;

public class Calculator {
    private Expression expression;

    /**
     * 构造函数传参数并解析
     *
     * @param expStr
     */
    public Calculator(String expStr) {
        // 安排运算的先后顺序
        Stack<Expression> stack = new Stack<>();
        //拆分字符串 a+b+c [a,+,b,+,c]
        char[] charArray = expStr.toCharArray();
        Expression left;
        Expression right;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    // 变量直接入栈
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        // 遍历完成，stack获得整个表达式
        this.expression=stack.pop();
    }

    public int run(Map<String,Integer> var){
        // 将表达式a+b与var变量绑定 var={a=10,b=5}
        return this.expression.interpreter(var);
    }


}
