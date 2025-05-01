package org.dp.StructuralPatterns.DecoratorPattern;

public class CheeseDecorator extends PizzaDecorator{

    Pizza pizza;

    public CheeseDecorator(Pizza pizza) {
      super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription()+" with added cheese";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost()+1.0;
    }
}
