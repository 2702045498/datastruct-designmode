package com.bange.designmode.designmode.statemodel;

// 抽奖活动类
public class RaffleActivity {
    AbstractState abstractState;
    int count = 0;
    AbstractState noRaffle = new NoRaffle(this);
    AbstractState canBeRaffle = new CanBeRaffle(this);
    AbstractState dispenseRaffle = new DispenseRaffle(this);
    AbstractState dispenseOutRaffle = new DispenseOutRaffle(this);

    public RaffleActivity(int count) {
        this.count = count;
        this.abstractState=getNoRaffle();
    }

    public void  deductMoney(){
        this.abstractState.deductMoney();
    }
    public  void isRaffle(){
        if(this.abstractState.isRaffle()) {
            this.abstractState.dispensePrize();
        }

    }

    public AbstractState getAbstractState() {
        return abstractState;
    }

    public void setAbstractState(AbstractState abstractState) {
        this.abstractState = abstractState;
    }

    public int getCount() {
        int curCount = count;
        count--;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public AbstractState getNoRaffle() {
        return noRaffle;
    }

    public void setNoRaffle(AbstractState noRaffle) {
        this.noRaffle = noRaffle;
    }

    public AbstractState getCanBeRaffle() {
        return canBeRaffle;
    }

    public void setCanBeRaffle(AbstractState canBeRaffle) {
        this.canBeRaffle = canBeRaffle;
    }

    public AbstractState getDispenseRaffle() {
        return dispenseRaffle;
    }

    public void setDispenseRaffle(AbstractState dispenseRaffle) {
        this.dispenseRaffle = dispenseRaffle;
    }

    public AbstractState getDispenseOutRaffle() {
        return dispenseOutRaffle;
    }

    public void setDispenseOutRaffle(AbstractState dispenseOutRaffle) {
        this.dispenseOutRaffle = dispenseOutRaffle;
    }
}
