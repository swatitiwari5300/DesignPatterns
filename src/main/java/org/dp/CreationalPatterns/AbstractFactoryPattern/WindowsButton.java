package org.dp.CreationalPatterns.AbstractFactoryPattern;

public class WindowsButton implements Button{
    @Override
    public void click() {
        System.out.println("Window's button was clicked.");
    }
}
