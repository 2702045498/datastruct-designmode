package com.bange.designmode.designmode.interpreter;

import java.util.Map;

/**
 * 表达式抽象类---通过hashMap获取到健值对
 */
public abstract class Expression {
    // key为表达式的[a,b,c] value为值 a=10
   abstract int interpreter(Map<String ,Integer> var);
}
