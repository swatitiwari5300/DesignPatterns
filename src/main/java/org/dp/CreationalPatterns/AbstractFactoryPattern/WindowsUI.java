package org.dp.CreationalPatterns.AbstractFactoryPattern;

public class WindowsUI implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Scroll createScroll() {
        return new WindowsScroll();
    }
}
