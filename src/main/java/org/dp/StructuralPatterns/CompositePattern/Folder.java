package org.dp.StructuralPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{

    private String name;
    private List<FileSystemComponent> componentList = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent fileSystemComponent){
        componentList.add(fileSystemComponent);
    }

    @Override
    public void showDetails() {
        System.out.println(this.name);
        componentList.forEach(FileSystemComponent::showDetails);
    }
}
