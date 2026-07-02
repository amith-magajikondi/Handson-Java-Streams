package org.playground;

import java.util.Arrays;
import java.util.List;

/**
 * Problem 23: Sort employees by department (alphabetical),
 * then salary (descending), then name (alphabetical).
 */
public class Problem23 {

    static class Employee {
        private final String name;
        private final String department;
        private final double salary;

        public Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getName() { return name; }
        public String getDepartment() { return department; }
        public double getSalary() { return salary; }

        @Override
        public String toString() {
            return String.format("[%s, %s, $%.0f]", department, name, salary);
        }
    }

    // METHOD TO IMPLEMENT
    public static List<Employee> sortEmployeesMultiCriteria(List<Employee> employees) {
        // TODO: Implement using Java Streams (sorted with chained comparators)
        return null;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Charlie", "IT", 60000),
                new Employee("Alice", "IT", 85000),
                new Employee("David", "HR", 50000),
                new Employee("Bob", "IT", 60000),      // Same Dept & Salary as Charlie, alphabetical name sort expected
                new Employee("Eva", "HR", 70000)
        );

        List<Employee> result = sortEmployeesMultiCriteria(employees);

        System.out.println("\n--- Problem 23 Test ---");
        System.out.println("Actual sorted result:");
        if (result != null) {
            result.forEach(System.out::println);
        }

        if (result != null &&
                result.get(0).getName().equals("Eva") &&     // HR ($70k)
                result.get(1).getName().equals("David") &&   // HR ($50k)
                result.get(2).getName().equals("Alice") &&   // IT ($85k)
                result.get(3).getName().equals("Bob") &&     // IT ($60k) - Alphabetically before Charlie
                result.get(4).getName().equals("Charlie")) { // IT ($60k)
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}
