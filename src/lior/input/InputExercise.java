package lior.input;

import lior.input.model.Book;

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
            String raw;
            while ((raw = reader.readLine()) != null) {
                String[] splitRaw = raw.split(", ");
                books.add(new Book(splitRaw[0], Float.parseFloat(splitRaw[1])));
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
