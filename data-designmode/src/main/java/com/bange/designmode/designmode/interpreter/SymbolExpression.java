package com.bange.designmode.designmode.interpreter;

import java.util.Map;

/**
 * 抽象运算符解析器
 * 每个运算符都只与左右两个表达式有关
 */
public class SymbolExpression extends Expression{
    Expression left;
    Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * 只是默认实现:j具体实现由子类进行实现
     * @param var
     * @return
     */
    @Override
    int interpreter(Map<String, Integer> var) {
        return 0;
    }
}
