package lior.output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputExercise {
    public static void main(String[] args) {
        String[] titles = {"Harry Potter","Effective Java", "John Wick","The Matrix", "Spider-Man" };
        float[] prices = {70.00F, 120.00F, 90.00F, 100.00F, 60.00F};


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("titles_to_prices.txt"));
            for (int i = 0; i < titles.length; i++) {
                writer.write(titles[i]+", "+prices[i]+ "\n" );
                writer.flush();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
