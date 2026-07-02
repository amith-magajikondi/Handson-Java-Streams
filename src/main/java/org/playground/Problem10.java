package org.playground;

import java.util.Arrays;
import java.util.List;

/**
 * Problem 10: Find top 5 longest strings.
 */

public class Problem10 {

    // METHOD TO IMPLEMENT
    public static List<String> findTop5LongestStrings(List<String> strings) {
        // TODO: Implement using Java Streams (sorted with Comparator, limit)
        return null;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "apple", "watermelon", "banana", "cherry", "strawberry",
                "blueberry", "kiwi", "fig", "pomegranate"
        );

        List<String> result = findTop5LongestStrings(strings);
        List<String> expected = Arrays.asList("pomegranate", "watermelon", "strawberry", "blueberry", "cherry");

        System.out.println("\n--- Problem 10 Test ---");
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + result);

        if (result != null && result.equals(expected)) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}
