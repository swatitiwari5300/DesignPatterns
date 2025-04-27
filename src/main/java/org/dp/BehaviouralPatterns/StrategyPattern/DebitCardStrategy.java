package org.dp.BehaviouralPatterns.StrategyPattern;

public class DebitCardStrategy implements Strategy{

    @Override
    public void pay() {
        System.out.println("Payment made by Debit Card");
    }
}
