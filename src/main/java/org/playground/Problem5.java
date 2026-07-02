package org.playground;

import java.util.Arrays;
import java.util.List;

/**
 * Problem 5: Flatten a List of Lists of Strings and remove duplicates.
 */

public class Problem5 {

    // METHOD TO IMPLEMENT
    public static List<String> flattenAndRemoveDuplicates(List<List<String>> nestedList) {
        // TODO: Implement using Java Streams (flatMap and distinct)
        return null;
    }

    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Java", "Python", "C++"),
                Arrays.asList("JavaScript", "Java", "Ruby"),
                Arrays.asList("Python", "Go")
        );

        List<String> result5 = flattenAndRemoveDuplicates(nestedList);
        List<String> expected = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby", "Go");

        System.out.println("\n--- Problem 5 Test ---");
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + result5);

        if (result5 != null && result5.size() == expected.size() && result5.containsAll(expected)) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}
