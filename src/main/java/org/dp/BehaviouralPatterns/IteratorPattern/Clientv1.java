package org.dp.BehaviouralPatterns.IteratorPattern;

import java.util.Iterator;

public class Clientv1 {

    public static void main(String[] args) {

        BookCollectionV1 bookCollectionV1 = new BookCollectionV1();
        bookCollectionV1.addBooks(new Book("English"));
        bookCollectionV1.addBooks(new Book("Java"));
        bookCollectionV1.addBooks(new Book("Mathematics"));

        Iterator<Book> iterator = bookCollectionV1.createIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
