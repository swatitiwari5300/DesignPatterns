package org.dp.CreationalPatterns.AbstractFactoryPattern;

public class MacOSScroll implements Scroll{
    @Override
    public void scroll() {
        System.out.println("MacOS's scroll was scrolled.");
    }
}
