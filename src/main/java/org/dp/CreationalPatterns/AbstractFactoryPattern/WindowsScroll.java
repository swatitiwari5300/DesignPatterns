package org.dp.CreationalPatterns.AbstractFactoryPattern;

public class WindowsScroll implements Scroll{
    @Override
    public void scroll() {
        System.out.println("Windows's scroll was scrolled.");
    }
}
