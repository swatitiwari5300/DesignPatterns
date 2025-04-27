package org.dp.BehaviouralPatterns.TemplateMethodPattern;

public class CSVParser extends DataParser{
    @Override
    protected void parseData() {
        System.out.println("CSV Data is being parsed");
    }
}
