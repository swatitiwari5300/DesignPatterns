package org.dp.StructuralPatterns.CompositePattern;

public class FileSystemClient {

    public static void main(String[] args) {
        FileSystemComponent file1 = new File("image.png");
        FileSystemComponent file2 = new File("notes.txt");

        Folder folder = new Folder("dir1");
        folder.addComponent(file1);
        folder.addComponent(file2);

        Folder subFolder = new Folder("dir2");

        FileSystemComponent file3 = new File("document.docx");
        subFolder.addComponent(file3);
        folder.addComponent(subFolder);

        folder.showDetails();
    }
}
