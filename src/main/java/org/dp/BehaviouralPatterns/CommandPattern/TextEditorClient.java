package org.dp.BehaviouralPatterns.CommandPattern;

public class TextEditorClient {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        Button button = new Button(new BoldCommand(textEditor));
        button.executeCommand();

        button.setCommand(new ItalicCommand(textEditor));
        button.executeCommand();

    }
}
