package org.dp.BehaviouralPatterns.ObserverPattern;

public class MobileObserver implements Observer{

    @Override
    public void display(String s) {
        System.out.println("Temperature on mobile device: "+s + " C");
    }
}
