package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private String libraryName;
    private ArrayList<Book> booksInLibrary;
    private int libraryCapacity;
    private HashMap<String , Integer> amountOfBooksByGenre;

    public Library(String name,int capacity){
        this.libraryName = name;
        this.booksInLibrary = new ArrayList<>();
        this.libraryCapacity = capacity;
        this.amountOfBooksByGenre = new HashMap<>();
    }

    public HashMap<String, Integer> getAmountOfBooksByGenre() {
        return amountOfBooksByGenre;
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

    public int findAmountOfBooksByGenre(String genre) {
        this.createHashMap();
        return this.amountOfBooksByGenre.get(genre);
//        int count =0;
//        for(int i =0; i < this.booksInLibrary.size();i++){
//            if(Objects.equals(booksInLibrary.get(i).getGenre(), genre)){
//                this.amountOfBooksByGenre.put(genre,1);
//                count++;
//            }
//        }
//        return count;
    }

    public void createHashMap() {
        // Does it stay here ?
        //Do I have to move it in the above function ?
        // Should this method be a private?
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
