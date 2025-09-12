package com.example.JunitProject;

import java.util.*;

public class LibraryClass implements Issueable {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) { books.add(book); }

    @Override
    public boolean issueBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                if (!b.isIssued()) {
                    b.setIssued(true);
                    return true;
                }
                return false; 
            }
        }
        return false; 
    }

    @Override
    public boolean returnBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                if (b.isIssued()) {
                    b.setIssued(false);
                    return true;
                }
                return false; 
            }
        }
        return false;
    }

    public boolean isAvailable(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                return b.isAvailable();
            }
        }
        return false;
    }
}
