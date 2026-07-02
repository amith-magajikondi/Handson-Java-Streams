package org.playground;

import java.util.Optional;

/**
 * Problem 21: Find longest word in a text ignoring punctuation.
 */
public class Problem21 {

    // METHOD TO IMPLEMENT
    public static Optional<String> findLongestWord(String text) {
        // TODO: Implement using Java Streams (split, regex cleanup, max with length comparator)
        return Optional.empty();
    }

    public static void main(String[] args) {
        String text = "The quick brown fox jumped, unexpectedly, over the extraordinarily lazy dog!";
        // "extraordinarily" has 15 characters and is the longest word.

        Optional<String> result = findLongestWord(text);
        String expected = "extraordinarily";

        System.out.println("\n--- Problem 21 Test ---");
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + result.orElse(null));

        if (result.isPresent() && result.get().equals(expected)) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}
