package org.example.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] books_array = {"Engineering a Compiler,9780120884780,7th February 2011",
                "Modern Operating Systems 4,9780133591620,21st March 2014",
                "Computer Networks,9332518742,9th January 2010"};
        ArrayList<Book> books = new ArrayList<>();
        for(int i = 0; i < books_array.length; i++) {
            String[] data = books_array[i].split(",");
            books.add(new Book(data[0], data[1], data[2]));
        }
        for(Book book : books) {
            System.out.println(book.toString());
        }
    }
}