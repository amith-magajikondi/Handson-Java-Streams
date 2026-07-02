package org.playground;

import java.util.Arrays;
import java.util.List;

/**
 * Problem 22: Find all anagram groups from a list of words.
 * Anagram groups with only 1 word should be excluded from the final output.
 */

public class Problem22 {

    // METHOD TO IMPLEMENT
    public static List<List<String>> findAnagramGroups(List<String> words) {
        // TODO: Implement using Java Streams (groupingBy with sorted characters as key, filter)
        return null;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "eat", "tea", "tan", "ate", "nat", "bat", "apple"
        );

        List<List<String>> result = findAnagramGroups(words);

        System.out.println("\n--- Problem 22 Test ---");
        System.out.println("Actual: " + result);

        // Expected matches: [eat, tea, ate] and [tan, nat]. [bat] and [apple] are excluded.
        if (result != null && result.size() == 2 &&
                result.stream().anyMatch(g -> g.containsAll(Arrays.asList("eat", "tea", "ate"))) &&
                result.stream().anyMatch(g -> g.containsAll(Arrays.asList("tan", "nat")))) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}
