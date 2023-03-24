package com.bange.designmode.designmode.interpreter;

import java.util.Map;

/**
 * 变量解析器
 */
public class VarExpression extends  Expression{
    // key=a;key=b
    private  String key;

    public VarExpression(String key) {
        this.key = key;
    }

    /**
     * 根据变量名称获取变量值
     * @param var
     * @return
     */
    @Override
    int interpreter(Map<String, Integer> var) {
        return var.get(key);
    }
}
