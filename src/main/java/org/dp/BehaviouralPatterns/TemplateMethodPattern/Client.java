package org.dp.BehaviouralPatterns.TemplateMethodPattern;

public class Client {
    public static void main(String[] args) {
        DataParser jsonParser = new JSONParser();
        DataParser csvParser = new CSVParser();

        jsonParser.parse();
        csvParser.parse();
    }
}
