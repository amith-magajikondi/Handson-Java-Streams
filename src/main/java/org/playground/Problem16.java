package org.playground;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * Problem 16: Find average salary by department and sort descending.
 */

public class Problem16 {

    static class Employee {
        private final String name;
        private final String department;
        private final double salary;

        public Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getDepartment() { return department; }
        public double getSalary() { return salary; }
    }

    // METHOD TO IMPLEMENT
    public static Map<String, Double> getAverageSalaryByDeptSorted(List<Employee> employees) {
        // TODO: Implement using Java Streams (groupingBy, averagingDouble, then sorting map entries)
        return null;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 60000),
                new Employee("Bob", "HR", 50000),
                new Employee("Charlie", "IT", 90000),   // IT Avg: 75,000
                new Employee("David", "Finance", 95000),// Finance Avg: 95,000
                new Employee("Eva", "HR", 60000)        // HR Avg: 55,000
        );

        Map<String, Double> result = getAverageSalaryByDeptSorted(employees);

        System.out.println("\n--- Problem 16 Test ---");
        System.out.println("Actual: " + result);

        if (result != null) {
            // Convert to keys list to check order: Finance (95k) -> IT (75k) -> HR (55k)
            List<String> keysOrder = List.copyOf(result.keySet());
            if (keysOrder.equals(Arrays.asList("Finance", "IT", "HR"))) {
                System.out.println("✅ Test Passed!");
                return;
            }
        }
        System.out.println("❌ Test Failed.");
    }
}
