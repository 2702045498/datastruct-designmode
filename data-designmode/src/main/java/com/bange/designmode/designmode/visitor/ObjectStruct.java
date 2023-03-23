package com.bange.designmode.designmode.visitor;

import java.util.LinkedList;
import java.util.List;
// 维护数据结构，管理多个Person
public class ObjectStruct {
    // 维护一个集合
   List<Person> personList = new LinkedList();

   // 增加到集合
   public void addPerson(Person person){
       personList.add(person);
   }

   // 删除一个
   public void deletePerson(Person person){
       personList.remove(person);
   }
// 显示测评结果
   public void evluateResult(Action action){
       for (Person p :personList) {
           p.accept(action);
       }
   }

}
