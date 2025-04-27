package org.dp.BehaviouralPatterns.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollectionV2 implements Iterable<Book>{

    private List<Book> bookList = new ArrayList<>();

    public void addBooks(Book b){
        bookList.add(b);
    }

    @Override
    public Iterator<Book> iterator() {
        return bookList.iterator();
    }
}
