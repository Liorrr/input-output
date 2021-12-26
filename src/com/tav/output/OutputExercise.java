package com.tav.output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputExercise {
    public static void main(String[] args) {
        String[] titles = { };
        float[] prices = { };

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("titles_to_prices.txt"));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
