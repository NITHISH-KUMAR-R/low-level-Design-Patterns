package com.designpattern.lld.iterator;

public class MainClient {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("HarryPotter"));
        library.addBook(new Book("GodZilla"));
        library.addBook(new Book("SpiderMan"));

        Iterator bookIterator = library.getIterator();
        while (bookIterator.hasNext()) {
            Book book = (Book) bookIterator.next();
            System.out.println(book.getTitle());
        }


    }
}
