package org.playground;

import java.util.Arrays;
import java.util.List;

/**
 * Problem 18: Find duplicate words in a sentence.
 */

public class Problem18 {

    // METHOD TO IMPLEMENT
    public static List<String> findDuplicateWords(String sentence) {
        // TODO: Implement using Java Streams (split, groupingBy, counting, filter)
        return null;
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog and the brown fox";

        List<String> result = findDuplicateWords(sentence);
        List<String> expected = Arrays.asList("the", "brown", "fox");

        System.out.println("\n--- Problem 18 Test ---");
        System.out.println("Expected (any order): " + expected);
        System.out.println("Actual:               " + result);

        if (result != null && result.size() == expected.size() && result.containsAll(expected)) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}
