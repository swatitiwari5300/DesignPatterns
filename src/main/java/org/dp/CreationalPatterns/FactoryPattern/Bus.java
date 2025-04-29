package org.dp.CreationalPatterns.FactoryPattern;

public class Bus implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivered by Bus");
    }
}
