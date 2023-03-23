package com.bange.designmode.designmode.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    // 目标对象
    private Object target;
    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * ClassLoader :目标对象使用的类加载器
     * Class<?>[] interfaces： 目标对象实现的所有接口
     * InvocationHandler ： 目标对象方法
     * @return
     */
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理开始");
                        Object returnVal = method.invoke(target, args);
                        return returnVal;
                    }
                });
    }
}
