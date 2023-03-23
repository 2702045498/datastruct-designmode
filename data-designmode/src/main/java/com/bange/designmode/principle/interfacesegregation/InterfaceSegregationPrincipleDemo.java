package com.bange.designmode.principle.interfacesegregation;

public class InterfaceSegregationPrincipleDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Weixin());
    }

}
class Email implements MessageInterface{
    public String getInfo(){
        return "邮件信息";
    }
}
class Weixin implements MessageInterface{
    public String getInfo(){
        return "weixin信息";
    }
}
interface  MessageInterface{
    public String getInfo();
}

class  Person{
    /**
     * 1.Person类 依赖Email 类
     * 2.存在的问题就是一旦依赖的类需要改变（如：微信、短信等信息时），Person也需要增加方法
     * 3. 用接口来的抽象来代替实际的类
     * @param message
     */
//    public void receive(Email email){
//        email.getInfo();
//    }

    /**
     * 1.Person类 依赖Email 类
     * 2.存在的问题就是一旦依赖的类需要改变（如：微信、短信等信息时），Person也需要增加方法
     * 3. 用接口来的抽象来代替实际的类(依赖倒转原则)
     * @param message
     */
    public void receive(MessageInterface message){
        String info = message.getInfo();
        System.out.println(info);
    }


}
