package org.playground;

import java.util.Arrays;
import java.util.List;

/**
 * Problem 12: Find common elements between two lists using streams.
 */

public class Problem12 {

    // METHOD TO IMPLEMENT
    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        // TODO: Implement using Java Streams (filter, contains)
        return null;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 9);

        List<Integer> result = findCommonElements(list1, list2);
        List<Integer> expected = Arrays.asList(4, 5, 6);

        System.out.println("\n--- Problem 12 Test ---");
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + result);

        if (result != null && result.size() == expected.size() && result.containsAll(expected)) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}
