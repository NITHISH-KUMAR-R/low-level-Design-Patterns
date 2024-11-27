package com.designpattern.lld.iterator;


import java.util.ArrayList;
import java.util.List;

public class Library implements Container {
    List<Book> list = new ArrayList<>();

    public Library() {
        list = new ArrayList<>();
    }

    public void addBook(Book book) {
        list.add(book);
    }


    @Override
    public Iterator getIterator() {
        return new BookIterator();
    }

    private class BookIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return list.get(index++);
            }
            return null;
        }
    }
}
