package org.playground;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Problem 11: Convert list of employees to Map handling duplicate IDs.
 * If duplicate IDs exist, retain the employee with the higher salary.
 */

public class Problem11 {

    static class Employee {
        private final int id;
        private final String name;
        private final double salary;

        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public double getSalary() { return salary; }
    }

    // METHOD TO IMPLEMENT
    public static Map<Integer, Employee> convertToMapHandlingDuplicates(List<Employee> employees) {
        // TODO: Implement using Java Streams (Collectors.toMap with a merge function)
        return null;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Alice", 60000),
                new Employee(102, "Bob", 75000),
                new Employee(101, "Charlie", 90000), // Duplicate ID 101, higher salary
                new Employee(103, "David", 50000)
        );

        Map<Integer, Employee> result = convertToMapHandlingDuplicates(employees);

        System.out.println("\n--- Problem 11 Test ---");
        if (result != null) {
            result.forEach((id, emp) -> System.out.println("ID: " + id + " -> Name: " + emp.getName() + " ($" + emp.getSalary() + ")"));
        }

        if (result != null &&
                result.get(101).getName().equals("Charlie") &&
                result.get(102).getName().equals("Bob")) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}
