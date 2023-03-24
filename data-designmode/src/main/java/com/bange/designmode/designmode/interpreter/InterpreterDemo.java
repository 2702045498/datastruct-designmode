package com.bange.designmode.designmode.interpreter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class InterpreterDemo {
    public static void main(String[] args) throws Exception {
        String expStr = getExpStr();
        Map<String, Integer> var = getExpStrValue(expStr);
        Calculator calculator = new Calculator(expStr);
        int result = calculator.run(var);
        System.out.println("计算结果："+result);
    }

    static String getExpStr() throws Exception{
        System.out.print("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }
    static Map<String,Integer> getExpStrValue(String expStr) throws Exception {
        Map<String,Integer> map=new HashMap<>();
        // a+b+c [a,+,b,+c]
        for (char ch:expStr.toCharArray()) {
            if(ch!='+'&&ch!='-'){
            if(!map.containsKey(String.valueOf(ch))){
                System.out.print("请输入"+String.valueOf(ch)+"的值：");
               String str= (new BufferedReader(new InputStreamReader(System.in))).readLine();
                map.put(String.valueOf(ch),Integer.valueOf(str));
            }
            }
        }
        return map;
    }

}
