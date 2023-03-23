package com.bange.datastructure.linkedlist.demo;

public class PetLinkedListDemo  {
    public static void main(String[] args) {
        PetLinkedList petLinkedList = new PetLinkedList();
        PetNode pet1 = new PetNode(1, "小猫", 1);
        PetNode pet2 = new PetNode(2, "小狗", 2);
        PetNode pet3 = new PetNode(3, "小强", 3);
        PetNode pet4 = new PetNode(4, "小牛", 4);
        PetNode pet5 = new PetNode(5, "小猪", 5);
        PetNode pet6 = new PetNode(6, "小鸭", 6);
        PetNode pet7 = new PetNode(7, "小鸡", 7);
        PetNode pet8 = new PetNode(8, "小鸟", 8);
//        petLinkedList.addNode(pet1);
//        petLinkedList.addNode(pet2);
//        petLinkedList.addNode(pet3);
//        petLinkedList.addNode(pet4);
//        petLinkedList.addNode(pet5);
        petLinkedList.addByOrder(pet1);
        petLinkedList.addByOrder(pet3);
        petLinkedList.addByOrder(pet5);
        petLinkedList.addByOrder(pet4);
        petLinkedList.addByOrder(pet2);
        petLinkedList.addByOrder(pet6);
        petLinkedList.addByOrder(pet7);
        petLinkedList.addByOrder(pet8);

        petLinkedList.list();

        System.out.println("-------------revese----------------------");
//        petLinkedList.reverse();
        petLinkedList.reversePetLikedList();
        petLinkedList.list();


//        System.out.println("-----------count------------");
//        System.out.println(petLinkedList.nodeCount());
//        System.out.println("--------------find---------------");
//        System.out.println(petLinkedList.find(3));

//
//        System.out.println("-------update----------");
//        PetNode pet9 = new PetNode(2, "小花", 3);
//        petLinkedList.update(pet9);
//        petLinkedList.list();
//
//        System.out.println("---------delete--------------");
//        petLinkedList.delete(2);
//        petLinkedList.list();
//
//        System.out.println("-----------count------------------");
//        System.out.println(petLinkedList.nodeCount());
//
//        petLinkedList.list();

    }
}
