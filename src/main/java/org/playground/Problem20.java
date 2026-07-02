package org.playground;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * Problem 20: Summarize integer statistics (min, max, sum, avg, count) for a dataset.
 */

public class Problem20 {

    // METHOD TO IMPLEMENT
    public static IntSummaryStatistics getIntegerStatistics(List<Integer> numbers) {
        // TODO: Implement using Java Streams (mapToInt and summaryStatistics)
        return null;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 12, 8, 18, 1, 20, 7);

        IntSummaryStatistics result = getIntegerStatistics(numbers);

        System.out.println("\n--- Problem 20 Test ---");
        if (result != null) {
            System.out.println("Count: " + result.getCount());
            System.out.println("Min:   " + result.getMin());
            System.out.println("Max:   " + result.getMax());
            System.out.println("Sum:   " + result.getSum());
            System.out.println("Avg:   " + result.getAverage());
        }

        if (result != null &&
                result.getCount() == 8 &&
                result.getMin() == 1 &&
                result.getMax() == 20 &&
                result.getSum() == 74 &&
                result.getAverage() == 9.25) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}
