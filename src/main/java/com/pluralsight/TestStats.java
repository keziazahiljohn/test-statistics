package com.pluralsight;

import java.util.Arrays;

public class TestStats {
    public static void main(String[] args) {
        int[] testScores = {98, 100, 36, 76, 80, 86, 88, 91, 90, 79};
        int sum = 0;
        int high = testScores[0];
        int low = testScores[0];

        // Get high and low and sum
        for (int score : testScores) {
            sum += score;
            if (score > high) {
                high = score;
            }

            if (score < low) {
                low = score;
            }
        }

        // Calculate Average
        double average = (double) sum / testScores.length;

        System.out.println("Test average is: " + average);
        System.out.println("Lowest grade is: " + low);
        System.out.println("Highest grade is: " + high);

        // Get the Median
        Arrays.sort(testScores);
        double median;
        double length = testScores.length;
        if (length % 2 == 0) {
            int middle1 = testScores.length / 2 - 1;
            int middle2 = testScores.length / 2;
            median = (testScores[middle1] + testScores[middle2] / 2.0);
        } else {
            int middle = testScores.length / 2;
            median = testScores[middle];
        }
        System.out.println("Median: " + median);
    }
}
