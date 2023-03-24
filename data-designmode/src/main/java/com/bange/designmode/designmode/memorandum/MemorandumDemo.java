package com.bange.designmode.designmode.memorandum;

public class MemorandumDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        MemorandumManager memorandumManager = new MemorandumManager();
        originator.setState(100);
        memorandumManager.addMemorandum(originator.saveMemorrandum());

        originator.setState(80);
        memorandumManager.addMemorandum(originator.saveMemorrandum());

        originator.setState(60);
        memorandumManager.addMemorandum(originator.saveMemorrandum());

        // 恢复
      originator.getStateFromMemorandum(  memorandumManager.get(1));
        System.out.println("恢复到状态1");
        System.out.println("恢复到当前状态："+originator.getState());
    }
}
