package org.playground;

import java.util.Arrays;
import java.util.List;

/**
 * Problem 24: Using flatMap(), produce all possible pairs from two lists.
 */

public class Problem24 {

    // METHOD TO IMPLEMENT
    public static List<String> generateAllPairs(List<String> list1, List<Integer> list2) {
        // TODO: Implement using Java Streams (flatMap and map to combine elements)
        return null;
    }

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A", "B", "C");
        List<Integer> list2 = Arrays.asList(1, 2);

        List<String> result = generateAllPairs(list1, list2);
        List<String> expected = Arrays.asList("A1", "A2", "B1", "B2", "C1", "C2");

        System.out.println("\n--- Problem 24 Test ---");
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + result);

        if (result != null && result.equals(expected)) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}
