package com.bange.datastructure.stack;

public class CalculatorUtil {
    public static void main(String[] args) {
        // 3+2*6-2
        CalculatorStack numberStack = new CalculatorStack(10);
        CalculatorStack operatorStack = new CalculatorStack(10);
        String expression="30000+2*6-2";
        int index=0;
        int num1=0;
        int num2=0;
        int oper=0;
        int result=0;
        char ch=' ';
        String manyNum="";
        while (true){
            ch=expression.substring(index, index + 1).charAt(0);
            if(isOperator(ch)){
                // 操作符
                if(operatorStack.isEmpty()){
                    operatorStack.push(ch);
                }else{
                    //扫描操作符与栈中的操作符的优先级进行比较
                    if(priority(ch)<=priority(operatorStack.peek())){
                        num1=numberStack.pop();
                        num2=numberStack.pop();
                        oper=operatorStack.pop();
                        result=cal(num1,num2,oper);
                        numberStack.push(result);
                        operatorStack.push(ch);
                    }else{
                        operatorStack.push(ch);
                    }
                }
            }else{
                // 数字则直接入栈 ascii数字与字符相差48
//                numberStack.push((ch-48));
                // 处理多位数
                manyNum+=ch;
                if(index==expression.length()-1){
                    numberStack.push(Integer.parseInt (manyNum));
                }else {
                    if(isOperator( expression.substring(index+1,index+2).charAt(0))){
                        //后一位是运算符则直接入栈
                        numberStack.push(Integer.parseInt (manyNum));
                        manyNum="";
                    }
                }

            }
            index++;
            //扫描结束
            if(index>=expression.length()){
                break;
            }
        }
        //当表达式扫描完毕，就顺序的从数栈和符号栈pop出相应的数和符号，并运算
        while (true){
            if(operatorStack.isEmpty()){
                break;
            }
            num1=numberStack.pop();
            num2=numberStack.pop();
            oper=operatorStack.pop();
            result=cal(num1,num2,oper);
            numberStack.push(result);
        }
        System.out.printf("计算结果：%s=%d\n",expression,numberStack.pop());
    }

    public static int priority(int operator){
        if(operator=='+'||operator=='-'){
            return 0;
        } else if (operator=='*'||operator=='/') {
            return 1;
        }
        return -1;
    }


    public static int cal(int num1,int num2,int operator){
        int result=0;
        switch (operator){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num2-num1;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                result=num2/num1;
                break;
            default:
                break;
        }
        return result;
    }

    /**
     * 判断数字还是字符串
     * @param ch
     * @return
     */
    public static boolean isOperator(char ch){
        if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
            return true;
        }
        return false;
    }


}
