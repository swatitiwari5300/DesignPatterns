package org.dp.CreationalPatterns.AbstractFactoryPattern;

public class MacOsUI implements UIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Scroll createScroll() {
        return new MacOSScroll();
    }
}
