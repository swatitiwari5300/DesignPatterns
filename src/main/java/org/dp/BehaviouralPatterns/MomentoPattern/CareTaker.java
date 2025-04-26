package org.dp.BehaviouralPatterns.MomentoPattern;

import java.util.Stack;

public class CareTaker {

    Stack<EditorMemento> history = new Stack<>();


    public void save(TextEditor textEditor){
        history.push(textEditor.saveContent());
    }

    public void undoContent(TextEditor editor){
        if(!history.isEmpty()){
            history.pop();
            editor.restoreContent(history.peek());
        }
    }
}
