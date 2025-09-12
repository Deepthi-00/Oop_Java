package com.example.JunitProject;

public class Book extends Ite {
    private String author, isbn;
    private boolean issued;

    public Book(String title, String author, String isbn) {
        super(title);
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isIssued() { return issued; }
    public void setIssued(boolean issued) { this.issued = issued; }
    public boolean isAvailable() { return !issued; }
}
