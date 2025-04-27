package org.dp.BehaviouralPatterns.CommandPattern;

public class Button {

    Command command;

    Button(Command command){
        this.command = command;
    }

    void executeCommand(){
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
