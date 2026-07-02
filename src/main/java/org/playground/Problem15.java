package org.playground;

import java.util.Arrays;
import java.util.List;

/**
 * Problem 15: Merge multiple lists and preserve encounter order while removing duplicates.
 */

public class Problem15 {

    // METHOD TO IMPLEMENT
    @SafeVarargs
    public static List<Integer> mergeAndPreserveOrder(List<Integer>... lists) {
        // TODO: Implement using Java Streams (Arrays.stream, flatMap, distinct)
        return null;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(5, 1, 3, 2);
        List<Integer> list2 = Arrays.asList(3, 8, 1, 9);
        List<Integer> list3 = Arrays.asList(2, 5, 7, 3);

        List<Integer> result = mergeAndPreserveOrder(list1, list2, list3);
        List<Integer> expected = Arrays.asList(5, 1, 3, 2, 8, 9, 7);

        System.out.println("\n--- Problem 15 Test ---");
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + result);

        if (result != null && result.equals(expected)) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}