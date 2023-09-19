package org.example;

import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowedBooks;
    private String name;

    public Borrower(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public ArrayList<Book> getBorrowerBooks() {
        return this.borrowedBooks;
    }

    public String getName() {
        return this.name;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void getABook(Book book) {
        this.borrowedBooks.add(book);
    }

    public void removeBookFromArray(Book book) {
        this.borrowedBooks.remove(book);
    }
}
