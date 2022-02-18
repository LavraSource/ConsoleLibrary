package com.company;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Book> bookTreeSet=new TreeSet<>();
        bookTreeSet.add(new Book("Шинель", "Гоголь", 1989));
        bookTreeSet.add(new Book("Чудеса у хутора близ Диканьки", "Гоголь", 1989));
        bookTreeSet.add(new Book("Преступление и наказание", "Достоевский", 1989));
        bookTreeSet.add(new Book("Гарри Поттер и Философский камень", "Роулинг", 1989));
        bookTreeSet.add(new Book("Гарри Поттер и Тайная комната", "Роулинг", 1989));
        System.out.println(bookTreeSet);
        Iterator<Book> iterator=bookTreeSet.iterator();
        while(iterator.hasNext()){
            Book book= iterator.next();
            if(book.author=="Роулинг"){
                System.out.println(book);
            }
        }
    }
}

