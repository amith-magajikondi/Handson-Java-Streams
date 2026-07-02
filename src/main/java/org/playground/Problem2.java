package org.playground;

import java.util.*;

/**
 * Problem 2: Group employees by department and count each group.
 */

public class Problem2 {

    static class Employee {
        private final String name;
        private final double salary;
        private final String department;

        public Employee(String name, double salary, String department) {
            this.name = name;
            this.salary = salary;
            this.department = department;
        }

        public String getName() { return name; }
        public double getSalary() { return salary; }
        public String getDepartment() { return department; }
    }

    // METHOD TO IMPLEMENT
    public static Map<String, Long> countEmployeesByDepartment(List<Employee> employees) {
        // TODO: Implement using Java Streams
        return null;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 45000, "IT"),
                new Employee("Bob", 75000, "HR"),
                new Employee("Charlie", 50000, "IT"),
                new Employee("David", 90000, "Finance"),
                new Employee("Eva", 60000, "HR"),
                new Employee("Frank", 55000, "IT")
        );

        // --- Problem 2 Test ---
        Map<String, Long> result = countEmployeesByDepartment(employees);
        Map<String, Long> expected = Map.of("IT", 3L, "HR", 2L, "Finance", 1L);

        System.out.println("\n--- Problem 2 Test ---");
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + result);

        if (expected.equals(result)) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}
