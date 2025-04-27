package org.dp.BehaviouralPatterns.IteratorPattern;

import java.util.Iterator;

public class ClientV2 {


    public static void main(String[] args) {
        BookCollectionV2 bookCollection = new BookCollectionV2();

        bookCollection.addBooks(new Book("English"));
        bookCollection.addBooks(new Book("Java"));
        bookCollection.addBooks(new Book("Mathematics"));

        Iterator<Book> iterator = bookCollection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
