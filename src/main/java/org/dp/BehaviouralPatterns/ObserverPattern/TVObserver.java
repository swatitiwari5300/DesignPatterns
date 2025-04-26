package org.dp.BehaviouralPatterns.ObserverPattern;

public class TVObserver implements Observer{

    String name;

    public TVObserver(String name) {
        this.name = name;
    }

    @Override
    public void display(String s) {
        System.out.println("Temperature on" + name + "device: "+s + " C");
    }
}
