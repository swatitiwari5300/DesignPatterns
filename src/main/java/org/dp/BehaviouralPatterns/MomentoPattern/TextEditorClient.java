package org.dp.BehaviouralPatterns.MomentoPattern;

public class TextEditorClient {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        CareTaker careTaker = new CareTaker();

        textEditor.write("hey this is first line");
        careTaker.save(textEditor);

        textEditor.write("hey this is second line");
        careTaker.save(textEditor);

        System.out.println(textEditor.content);
        careTaker.undoContent(textEditor);

        System.out.println(textEditor.content);
    }
}
