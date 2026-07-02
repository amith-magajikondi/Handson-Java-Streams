package org.playground;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Problem 6: Find second-highest distinct salary.
 */

public class Problem6 {

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
    public static Optional<Double> findSecondHighestSalary(List<Employee> employees) {
        // TODO: Implement using Java Streams (distinct, sorted, skip, findFirst)
        return Optional.empty();
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 90000),
                new Employee("Bob", 75000),
                new Employee("Charlie", 90000), // Duplicate highest salary
                new Employee("David", 80000),
                new Employee("Eva", 60000)
        );

        Optional<Double> result = findSecondHighestSalary(employees);
        Double expected = 80000.0; // 90k is highest, 80k is second highest distinct

        System.out.println("\n--- Problem 6 Test ---");
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + result.orElse(null));

        if (result.isPresent() && result.get().equals(expected)) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}
