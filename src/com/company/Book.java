package com.company;

import java.util.Objects;

public class Book implements Comparable {
    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return title + " " + author;
    }


    @Override
    public int compareTo(Object o) {
        Book otherBook=(Book)o;
        if(!author.equals(otherBook.author)){
            return author.compareTo(otherBook.author);
        }else {
            return title.compareTo(otherBook.title);
        }
    }

    @Override
    public boolean equals(Object o) {
        Book book = (Book) o;
        return title.equals(book.title) && author.equals(book.author);
    }
}
