package org.dp.CreationalPatterns.AbstractFactoryPattern;

public class Application {

    Button button;
    Scroll scroll;

    public Application(UIFactory uiFactory) {
        this.button = uiFactory.createButton();
        this.scroll = uiFactory.createScroll();
    }

    void render(){
        button.click();
        scroll.scroll();
    }

    public static void main(String[] args) {
        Application application = new Application(new WindowsUI());
        application.render();
    }
}
