package org.playground;

import java.util.List;

/**
 * Problem 14: Generate first 20 Fibonacci numbers using Stream.iterate().
 */

public class Problem14 {

    // METHOD TO IMPLEMENT
    public static List<Long> generateFirst20Fibonacci() {
        // TODO: Implement using Stream.iterate(), limit(), and map()
        return null;
    }

    public static void main(String[] args) {
        List<Long> result = generateFirst20Fibonacci();

        // The first 10 for quick visual verification: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        long expected20th = 4181L;

        System.out.println("\n--- Problem 14 Test ---");
        System.out.println("Actual: " + result);

        if (result != null && result.size() == 20 && result.get(19) == expected20th) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}
