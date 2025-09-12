package com.example.JunitProject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BokTest {
    @Test
    void testBookCreation() {
        Book b = new Book("Java", "Ullas", "123");
        assertEquals("Java", b.getTitle());
        assertTrue(b.isAvailable());
    }
}
