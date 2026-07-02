package org.playground;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Problem 9: Group transactions by month and sum amounts.
 */

public class Problem9 {

    static class Transaction {
        private final LocalDate date;
        private final double amount;

        public Transaction(LocalDate date, double amount) {
            this.date = date;
            this.amount = amount;
        }

        public LocalDate getDate() { return date; }
        public double getAmount() { return amount; }
    }

    // METHOD TO IMPLEMENT
    public static Map<Month, Double> sumTransactionsByMonth(List<Transaction> transactions) {
        // TODO: Implement using Java Streams (groupingBy, summingDouble)
        return null;
    }

    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(LocalDate.of(2026, 1, 15), 150.0),
                new Transaction(LocalDate.of(2026, 1, 20), 250.0),
                new Transaction(LocalDate.of(2026, 2, 10), 100.0),
                new Transaction(LocalDate.of(2026, 2, 28), 50.0),
                new Transaction(LocalDate.of(2026, 3, 5), 300.0)
        );

        Map<Month, Double> result = sumTransactionsByMonth(transactions);

        System.out.println("\n--- Problem 9 Test ---");
        System.out.println("Actual: " + result);

        if (result != null &&
                result.get(Month.JANUARY) == 400.0 &&
                result.get(Month.FEBRUARY) == 150.0 &&
                result.get(Month.MARCH) == 300.0) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}
