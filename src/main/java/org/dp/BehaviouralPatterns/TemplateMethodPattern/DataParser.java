package org.dp.BehaviouralPatterns.TemplateMethodPattern;

public abstract class DataParser {

    void parse(){
        openData();
        parseData();
        closeData();
    }

    protected void openData(){
        System.out.println("Data is opened");
    }

    protected void closeData(){
        System.out.println("Data is Closed");
    }

    protected abstract void parseData();
}
