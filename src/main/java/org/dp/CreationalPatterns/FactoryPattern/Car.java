package org.dp.CreationalPatterns.FactoryPattern;

public class Car implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivered by Car");
    }
}
