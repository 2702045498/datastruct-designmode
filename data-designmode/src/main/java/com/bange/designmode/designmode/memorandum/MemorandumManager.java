package com.bange.designmode.designmode.memorandum;

import java.util.ArrayList;
import java.util.List;

public class MemorandumManager {
    List<Memorandum> memorandumList=new ArrayList<>();

    public void addMemorandum(Memorandum memorandum){
        memorandumList.add(memorandum);
    }
    // 获取Origintor的备忘录对象（即保存的对象状态）
    public Memorandum get(int index){
        return memorandumList.get(index);
    }
}
