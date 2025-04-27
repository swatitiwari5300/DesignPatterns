package org.dp.BehaviouralPatterns.IteratorPattern;

import java.util.*;

public class BookCollectionV1 {

    private List<Book> bookList = new ArrayList<>();

    public void addBooks(Book b){
        bookList.add(b);
    }

    public Iterator<Book> createIterator(){
        return new BookIterator(this.bookList);
    }

    private class BookIterator implements Iterator<Book>{

        List<Book> bookList;
        int pos;

        public BookIterator(List<Book> bookList) {
            this.bookList = bookList;
        }

        @Override
        public boolean hasNext() {
            return pos < bookList.size();
        }

        @Override
        public Book next() {
            return bookList.get(pos++);
        }
    }

}
