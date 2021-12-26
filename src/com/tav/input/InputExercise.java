package com.tav.input;

import com.tav.input.model.Book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputExercise {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("titles_to_prices.txt"));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
