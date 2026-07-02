package org.playground;

import java.util.Optional;

/**
 * Problem 7: Find first non-repeating character in a string using streams.
 */

public class Problem7 {

    // METHOD TO IMPLEMENT
    public static Optional<Character> findFirstNonRepeatingChar(String input) {
        // TODO: Implement using Java Streams (chars, LinkedHashMap, filtering)
        return Optional.empty();
    }

    public static void main(String[] args) {
        String input = "swiss"; // 'w' is the first non-repeating character

        Optional<Character> result = findFirstNonRepeatingChar(input);
        Character expected = 'w';

        System.out.println("\n--- Problem 7 Test ---");
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + result.orElse(null));

        if (result.isPresent() && result.get().equals(expected)) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}
