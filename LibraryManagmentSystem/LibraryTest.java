package com.example.JunitProject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    private LibraryClass library;

    @BeforeEach
    void setup() {
        library = new LibraryClass();
        library.addBook(new Book("Java Basics", "Ullas", "101"));
    }

    @Test
    void testIssueBook() {
        library.issueBook("101");
        assertFalse(library.isAvailable("101"));
    }

    @Test
    void testReturnBook() {
        library.issueBook("101");
        library.returnBook("101");
        assertTrue(library.isAvailable("101"));
    }

    @Test
    void testIsAvailable() {
        assertTrue(library.isAvailable("101"));
    }
}
