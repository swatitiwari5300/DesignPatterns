package org.dp.StructuralPatterns.ProxyPattern;

public class RealImage implements Image{
    String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadImageFromDisk();
    }

    public void loadImageFromDisk(){
        System.out.println(this.fileName+ " is loading from the disk.");
    }

    @Override
    public void display() {
        System.out.println("The image is of beautiful landscape");
    }
}
