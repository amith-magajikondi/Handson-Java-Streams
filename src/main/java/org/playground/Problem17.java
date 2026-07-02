package org.playground;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Problem 17: Group employees by city then department (nested grouping).
 */

public class Problem17 {

    static class Employee {
        private final String name;
        private final String city;
        private final String department;

        public Employee(String name, String city, String department) {
            this.name = name;
            this.city = city;
            this.department = department;
        }

        public String getCity() { return city; }
        public String getDepartment() { return department; }
        public String getName() { return name; }
    }

    // METHOD TO IMPLEMENT
    public static Map<String, Map<String, List<Employee>>> groupByCityThenDept(List<Employee> employees) {
        // TODO: Implement using Java Streams (nested groupingBy)
        return null;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "New York", "IT"),
                new Employee("Bob", "New York", "HR"),
                new Employee("Charlie", "London", "IT"),
                new Employee("David", "London", "IT"),
                new Employee("Eva", "New York", "IT")
        );

        Map<String, Map<String, List<Employee>>> result = groupByCityThenDept(employees);

        System.out.println("\n--- Problem 17 Test ---");
        if (result != null) {
            result.forEach((city, deptMap) -> {
                System.out.println("City: " + city);
                deptMap.forEach((dept, list) ->
                        System.out.println("  Department: " + dept + " -> Counts: " + list.size())
                );
            });
        }

        if (result != null &&
                result.containsKey("New York") &&
                result.get("New York").get("IT").size() == 2 &&
                result.get("London").get("IT").size() == 2) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}
