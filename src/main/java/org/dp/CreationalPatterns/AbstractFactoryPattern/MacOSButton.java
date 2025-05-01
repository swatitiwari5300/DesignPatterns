package org.dp.CreationalPatterns.AbstractFactoryPattern;

public class MacOSButton implements Button{
    @Override
    public void click() {
        System.out.println("MacOS's button was clicked.");
    }
}
