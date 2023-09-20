package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private String libraryName;
    private ArrayList<Book> booksInLibrary;
    private int libraryCapacity;
    private HashMap<String , Integer> amountOfBooksByGenre;
    private ArrayList<Borrower> listOfBorrowers;

    public Library(String name,int capacity){
        this.libraryName = name;
        this.booksInLibrary = new ArrayList<>();
        this.libraryCapacity = capacity;
        this.amountOfBooksByGenre = new HashMap<>();
        this.listOfBorrowers = new ArrayList<>();
    }

    public HashMap<String, Integer> getAmountOfBooksByGenre() {
        return amountOfBooksByGenre;
    }

    public ArrayList<Borrower> getListOfBorrowers() {
        return listOfBorrowers;
    }

    public int getLibraryCapacity() {
        return libraryCapacity;
    }

    public int countTheBooks() {
        return this.booksInLibrary.size();
    }

    public void addBook(Book book){
        if(this.enoughCapacityToAddABook()){
            this.booksInLibrary.add(book);
        }
    }

    public boolean enoughCapacityToAddABook() {
        return countTheBooks() < getLibraryCapacity();
    }

    public void borrowABook(Book book,Borrower borrower){
        this.booksInLibrary.add(book);
        this.listOfBorrowers.add(borrower);
    }

    public int findAmountOfBooksByGenre(String genre) {
        return this.amountOfBooksByGenre.get(genre);
    }

    public void createHashMap() {
        this.amountOfBooksByGenre.clear();
        for (Book book : this.booksInLibrary) {
            if (!this.amountOfBooksByGenre.containsKey(book.getGenre())) {
                this.amountOfBooksByGenre.put(book.getGenre(), 1);
            } else {
                int previous = this.amountOfBooksByGenre.get(book.getGenre());
                this.amountOfBooksByGenre.put(book.getGenre(), previous + 1);
            }
        }
    }
}
