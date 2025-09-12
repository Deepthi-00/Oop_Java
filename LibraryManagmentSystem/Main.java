package com.example.JunitProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryClass library = new LibraryClass();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Check Availability");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt(); sc.nextLine();

            if (choice == 1) {
                System.out.print("Title: "); String title = sc.nextLine();
                System.out.print("Author: "); String author = sc.nextLine();
                System.out.print("ISBN: "); String isbn = sc.nextLine();
                library.addBook(new Book(title, author, isbn));
                System.out.println("Book added.");
            } 
            else if (choice == 2) {
                System.out.print("Enter ISBN to issue: ");
                String isbn = sc.nextLine();
                if (library.issueBook(isbn)) {
                    System.out.println("Book issued.");
                } else {
                    System.out.println("Book not found or already issued.");
                }
            } 
            else if (choice == 3) {
                System.out.print("Enter ISBN to return: ");
                String isbn = sc.nextLine();
                if (library.returnBook(isbn)) {
                    System.out.println("Book returned.");
                } else {
                    System.out.println("Book not found or was not issued.");
                }
            } 
            else if (choice == 4) {
                System.out.print("Enter ISBN: ");
                String isbn = sc.nextLine();
                System.out.println(library.isAvailable(isbn) ?
                        "Book is available." : "Book is not available.");
            } 
            else if (choice == 5) {
                System.out.println("Goodbye!");
                return;
            } 
            else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
