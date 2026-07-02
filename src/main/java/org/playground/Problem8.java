package org.playground;

import java.util.Map;

/**
 * Problem 8: Count frequency of each word in a paragraph.
 */

public class Problem8 {

    // METHOD TO IMPLEMENT
    public static Map<String, Long> countWordFrequency(String paragraph) {
        // TODO: Implement using Java Streams (split, groupingBy, counting)
        return null;
    }

    public static void main(String[] args) {
        String paragraph = "The cat sat on the mat and the dog sat on the rug";

        Map<String, Long> result = countWordFrequency(paragraph);

        System.out.println("\n--- Problem 8 Test ---");
        System.out.println("Actual: " + result);

        if (result != null &&
                result.get("the") == 4L &&
                result.get("sat") == 2L &&
                result.get("cat") == 1L) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}
