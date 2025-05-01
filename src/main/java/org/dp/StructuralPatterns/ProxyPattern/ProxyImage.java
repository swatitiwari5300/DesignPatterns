package org.dp.StructuralPatterns.ProxyPattern;

public class ProxyImage implements Image{

    String fileName;
    RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(this.fileName);
        }
        realImage.display();
    }
}
