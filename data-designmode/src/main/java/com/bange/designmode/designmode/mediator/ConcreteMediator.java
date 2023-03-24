package com.bange.designmode.designmode.mediator;

import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator  extends  AbstractMediator{

    Map<String,AbstractColleague> colleagueMap;
    Map<String,String> interMap;

    public ConcreteMediator() {
        this.colleagueMap =new HashMap<>();
        this.interMap = new HashMap<>();
    }



    @Override
    void register(String colleagueName, AbstractColleague colleague) {
        colleagueMap.put(colleagueName,colleague);
        if(colleague instanceof AlarmClock){
            interMap.put("AlarmClock",colleagueName);
        }else if(colleague instanceof Curtain){
            interMap.put("Curtain",colleagueName);
        }else if(colleague instanceof TV){
            interMap.put("TV",colleagueName);
        }
    }
    /**
     *1.中介在该方法中协调同事者完成任务
     * 2.具体同事对象发出的消息
     */
    @Override
    void getMessage(int state, String colleagueName) {
        if(colleagueMap.get(colleagueName) instanceof AlarmClock){
            if(state==0){
                //打开电视
                ((TV) colleagueMap.get(interMap.get("TV"))).on();
                // 拉上窗帘
                ((Curtain)colleagueMap.get(interMap.get("Curtain"))).up();
            } else if (state==1) {
                // 关电视
                ((TV) colleagueMap.get(interMap.get("TV"))).off();
            }
        } else if (colleagueMap.get(colleagueName) instanceof TV) {
            ((Curtain)colleagueMap.get(interMap.get("Curtain"))).down();
        } else if (colleagueMap.get(colleagueName) instanceof Curtain) {
            ((AlarmClock) colleagueMap.get(interMap.get("AlarmClock"))).close();
        }
    }

    @Override
    void sendMessage() {

    }
}
