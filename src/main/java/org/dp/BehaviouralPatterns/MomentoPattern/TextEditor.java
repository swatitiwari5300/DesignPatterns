package org.dp.BehaviouralPatterns.MomentoPattern;

public class TextEditor {

    String content;

    public void write(String content){
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public EditorMemento saveContent(){
        return new EditorMemento(this.content);
    }

    public void restoreContent(EditorMemento editorMemento){
        this.content = editorMemento.content;
    }
}
