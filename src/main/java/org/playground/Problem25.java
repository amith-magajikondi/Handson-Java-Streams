package org.playground;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Problem 25: Given orders with line items, compute total revenue per customer
 * using groupingBy and flatMap techniques.
 */

public class Problem25 {

    static class LineItem {
        private final String item;
        private final double price;
        private final int quantity;

        public LineItem(String item, double price, int quantity) {
            this.item = item;
            this.price = price;
            this.quantity = quantity;
        }

        public double getTotalPrice() { return price * quantity; }
    }

    static class Order {
        private final String customerName;
        private final List<LineItem> lineItems;

        public Order(String customerName, List<LineItem> lineItems) {
            this.customerName = customerName;
            this.lineItems = lineItems;
        }

        public String getCustomerName() { return customerName; }
        public List<LineItem> getLineItems() { return lineItems; }
    }

    // METHOD TO IMPLEMENT
    public static Map<String, Double> computeTotalRevenuePerCustomer(List<Order> orders) {
        // TODO: Implement using Java Streams (flatMap to flatten orders or downstream collection metrics)
        return null;
    }

    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("Alice", Arrays.asList(
                        new LineItem("Laptop", 1200.0, 1),
                        new LineItem("Mouse", 25.0, 2)
                )), // Alice Total = 1250
                new Order("Bob", Arrays.asList(
                        new LineItem("Phone", 800.0, 1)
                )), // Bob Total = 800
                new Order("Alice", Arrays.asList(
                        new LineItem("Monitor", 300.0, 2)
                )) // Alice Additions = 600 -> Alice Total = 1850
        );

        Map<String, Double> result = computeTotalRevenuePerCustomer(orders);

        System.out.println("\n--- Problem 25 Test ---");
        System.out.println("Actual: " + result);

        if (result != null &&
                result.get("Alice") == 1850.0 &&
                result.get("Bob") == 800.0) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}
