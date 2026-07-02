package org.playground;

import java.util.*;
import java.util.stream.*;

/**
 * Problem 3: Find highest-paid employee in each department.
 */

public class Problem3 {

    static class Employee {
        private final String name;
        private final double salary;
        private final String department;

        public Employee(String name, double salary, String department) {
            this.name = name;
            this.salary = salary;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public String getDepartment() {
            return department;
        }
    }

    // METHOD TO IMPLEMENT
    public static Map<String, Employee> getHighestPaidByDepartment(List<Employee> employees) {
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

        // --- Problem 3 Test ---
        Map<String, Employee> result = Solutions.getHighestPaidByDepartment(employees);

        System.out.println("\n--- Problem 3 Test ---");
        if (result != null &&
                result.get("IT").getName().equals("Frank") &&
                result.get("HR").getName().equals("Bob") &&
                result.get("Finance").getName().equals("David")) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed. Output: " +
                    (result != null ? result.entrySet().stream()
                            .collect(Collectors.toMap(Map.Entry<String, Employee>::getKey, e -> e.getValue().getName())) : "null"));
        }
    }
}

