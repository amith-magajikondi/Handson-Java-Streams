package org.playground;

import java.util.Arrays;
import java.util.List;

/**
 * Problem 13: Find products never ordered from products and orders collections.
 */

public class Problem13 {

    static class Product {
        private final int id;
        private final String name;

        public Product(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() { return id; }
        public String getName() { return name; }
    }

    static class Order {
        private final int orderId;
        private final int productId;

        public Order(int orderId, int productId) {
            this.orderId = orderId;
            this.productId = productId;
        }

        public int getProductId() { return productId; }
    }

    // METHOD TO IMPLEMENT
    public static List<Product> findNeverOrderedProducts(List<Product> products, List<Order> orders) {
        // TODO: Implement using Java Streams (map orders to product IDs, filter products)
        return null;
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(1, "Laptop"),
                new Product(2, "Phone"),
                new Product(3, "Tablet"),
                new Product(4, "Monitor")
        );

        List<Order> orders = Arrays.asList(
                new Order(101, 1),
                new Order(102, 2),
                new Order(103, 1)
        );

        List<Product> result = findNeverOrderedProducts(products, orders);

        System.out.println("\n--- Problem 13 Test ---");
        if (result != null) {
            result.forEach(p -> System.out.println("Never Ordered: " + p.getName()));
        }

        if (result != null && result.size() == 2 &&
                result.stream().anyMatch(p -> p.getName().equals("Tablet")) &&
                result.stream().anyMatch(p -> p.getName().equals("Monitor"))) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}
