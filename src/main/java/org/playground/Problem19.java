package org.playground;

import java.util.Map;

/**
 * Problem 19: Build a histogram of character frequencies.
 * Exclude spaces from the tracking histogram.
 */

public class Problem19 {

    // METHOD TO IMPLEMENT
    public static Map<Character, Long> buildCharacterHistogram(String input) {
        // TODO: Implement using Java Streams (chars, filter, groupingBy, counting)
        return null;
    }

    public static void main(String[] args) {
        String input = "hello world";

        Map<Character, Long> result = buildCharacterHistogram(input);

        System.out.println("\n--- Problem 19 Test ---");
        System.out.println("Actual Histogram: " + result);

        if (result != null &&
                result.get('l') == 3L &&
                result.get('o') == 2L &&
                result.get('h') == 1L &&
                !result.containsKey(' ')) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}
