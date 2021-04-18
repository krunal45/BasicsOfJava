package com.java.interview_questions;

import java.util.ArrayList;

public class StreamsExample {

    public static void main(String[] args) {
        ArrayList<Book> bookStore = getBooks();
        bookStore.stream().filter(book -> book.getAuthor().startsWith("B")).filter(book->book.getTitle().startsWith("B")).forEach(System.out::println);
    }

    public static ArrayList<Book> getBooks() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("ABC", "AAA"));
        books.add(new Book("ABCD", "AABB"));
        books.add(new Book("BGHJ", "BBHJUI"));
        return books;
    }

}

class Book {
    String author, bookTitle;

    Book(String author, String bookTitle) {
        this.author = author;
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return bookTitle;
    }

    public String toString() {
        return ("Author " + author + " BookTitle :" + bookTitle);
    }

}
