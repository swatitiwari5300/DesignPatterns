package org.dp.StructuralPatterns.DecoratorPattern;

public class MushroomDecorator extends PizzaDecorator{
    Pizza pizza;

    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription()+" with added mushroom";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost()+2.0;
    }
}
