package com.bange.designmode.designmode.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        // person
        ObjectStruct objectStruct = new ObjectStruct();
        objectStruct.addPerson(new Man() );
        objectStruct.addPerson(new Woman() );
        //测评
        SuccessEvluation successEvluation = new SuccessEvluation();
        FailEvluation failEvluation = new FailEvluation();
        objectStruct.evluateResult(successEvluation);
        System.out.println("---------------");
        objectStruct.evluateResult(failEvluation);

    }
}
