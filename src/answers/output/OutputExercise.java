package answers.output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputExercise {
    public static void main(String[] args) {
        String[] titles = { "Harry Potter", "Effective Java" };
        float[] prices = { 40f, 70f };

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("titles_to_prices.txt"));
            for (int i = 0; i < titles.length; i++) {
                writer.write(titles[i] + "-" + prices[i] + "\n");
            }
            writer.flush();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
