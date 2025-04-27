package org.dp.BehaviouralPatterns.TemplateMethodPattern;

public class JSONParser extends DataParser{
    @Override
    protected void parseData() {
        System.out.println("JSON Data is being parsed");
    }
}
