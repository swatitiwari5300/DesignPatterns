package org.dp.CreationalPatterns.FactoryPattern;

public class Bike implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivered by Bike");
    }
}
