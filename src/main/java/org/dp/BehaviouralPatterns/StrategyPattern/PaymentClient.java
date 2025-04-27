package org.dp.BehaviouralPatterns.StrategyPattern;

public class PaymentClient {

    public static void main(String[] args) {
        Payment payment = new Payment();
        CreditCardStrategy creditCardStrategy = new CreditCardStrategy();


        payment.setStrategy(creditCardStrategy);
        payment.makePayment();

        DebitCardStrategy debitCardStrategy = new DebitCardStrategy();
        payment.setStrategy(debitCardStrategy);

        payment.makePayment();
    }
}
