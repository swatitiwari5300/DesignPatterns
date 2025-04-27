package org.dp.BehaviouralPatterns.StrategyPattern;

public class CreditCardStrategy implements Strategy{

    @Override
    public void pay() {
        System.out.println("Payment made by Credit Card");
    }
}
