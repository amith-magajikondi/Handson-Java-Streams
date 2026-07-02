package org.playground;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Solutions {

    // ========================================================================
    // PROBLEM 1: Find names of employees earning above 50,000 sorted by salary descending.
    // ========================================================================
    public static List<String> getHighEarnersSortedBySalary(List<Problem1.Employee> employees) {
        return employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .sorted(Comparator.comparingDouble(Problem1.Employee::getSalary).reversed())
                .map(Problem1.Employee::getName)
                .collect(Collectors.toList());
    }

    // ========================================================================
    // PROBLEM 2: Group employees by department and count each group.
    // ========================================================================
    public static Map<String, Long> countEmployeesByDepartment(List<Problem2.Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(
                        Problem2.Employee::getDepartment,
                        Collectors.counting()
                ));
    }

    // ========================================================================
    // PROBLEM 3: Find highest-paid employee in each department.
    // ========================================================================

    public static Map<String, Problem3.Employee> getHighestPaidByDepartment(List<Problem3.Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(
                        Problem3.Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Problem3.Employee::getSalary)),
                                Optional::get // Safe to call here as groupingBy won't create empty lists
                        )
                ));
    }

    // ========================================================================
    // PROBLEM 4: Partition students into pass/fail based on marks (Threshold: 50).
    // ========================================================================
    public static Map<Boolean, List<Problem4.Student>> partitionStudentsByPassFail(List<Problem4.Student> students) {
        return students.stream()
                .collect(Collectors.partitioningBy(student -> student.getMarks() >= 50));
    }

    // ========================================================================
    // PROBLEM 5: Flatten a List<List<String>> and remove duplicates.
    // ========================================================================
    public static List<String> flattenAndRemoveDuplicates(List<List<String>> nestedList) {
        return nestedList.stream()
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
    }
}
