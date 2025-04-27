package org.dp.BehaviouralPatterns.StrategyPattern;

public class Payment {

    Strategy strategy;


    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }


    public void makePayment(){
        strategy.pay();
    }
}
