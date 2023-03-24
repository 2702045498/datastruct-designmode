package com.bange.designmode.designmode.interpreter;

import java.util.Map;

/**
 * 加法解释器
 */
public class AddExpression  extends SymbolExpression{
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int interpreter(Map<String, Integer> var) {
        return super.left.interpreter(var)+super.right.interpreter(var);
    }
}
