package org.dp.StructuralPatterns.DecoratorPattern;

public class BasicPizza implements Pizza{
    Pizza basicPizza;
    @Override
    public String getDescription() {
        return "This is a pizza";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
