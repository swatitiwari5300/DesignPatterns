package org.dp.StructuralPatterns.DecoratorPattern;

public class PizzaApp {

    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();

        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription());
    }
}
