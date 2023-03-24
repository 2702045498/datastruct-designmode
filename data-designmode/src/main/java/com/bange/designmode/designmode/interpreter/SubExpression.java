package com.bange.designmode.designmode.interpreter;

import java.util.Map;

public class SubExpression  extends  SymbolExpression{
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int interpreter(Map<String, Integer> var) {
        return super.left.interpreter(var)-super.right.interpreter(var);
    }
}
