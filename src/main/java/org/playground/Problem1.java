package org.playground;

import java.util.Arrays;
import java.util.List;

/**
 * Problem 1: Find names of employees earning above 50,000 sorted by salary descending.
 */

public class Problem1 {

    static class Employee {
        private final String name;
        private final double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() { return name; }
        public double getSalary() { return salary; }
    }

    // METHOD TO IMPLEMENT
    public static List<String> getHighEarnersSortedBySalary(List<Employee> employees) {
        // TODO: Implement using Java Streams
        return null;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 45000),
                new Employee("Bob", 75000),
                new Employee("Charlie", 50000),
                new Employee("David", 90000),
                new Employee("Eva", 60000)
        );

        List<String> result = getHighEarnersSortedBySalary(employees);

        System.out.println("--- Problem 1 Test ---");
        System.out.println("Expected: [David, Bob, Eva]");
        System.out.println("Actual:   " + result);

        if (result.equals(Arrays.asList("David", "Bob", "Eva"))) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}
