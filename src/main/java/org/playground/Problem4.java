package org.playground;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Problem 4: Partition students into pass/fail based on marks.
 * Passing mark is 50 or above.
 */

public class Problem4 {

    static class Student {
        private final String name;
        private final int marks;

        public Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        public String getName() { return name; }
        public int getMarks() { return marks; }
    }

    // METHOD TO IMPLEMENT
    public static Map<Boolean, List<Student>> partitionStudentsByPassFail(List<Student> students) {
        // TODO: Implement using Java Streams (Collectors.partitioningBy)
        return null;
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Tom", 85),
                new Student("Jerry", 42),
                new Student("Spike", 50),
                new Student("Tyke", 30)
        );

        Map<Boolean, List<Student>> result4 = partitionStudentsByPassFail(students);

        System.out.println("\n--- Problem 4 Test ---");
        if (result4 != null &&
                result4.get(true).stream().anyMatch(s -> s.getName().equals("Tom")) &&
                result4.get(false).stream().anyMatch(s -> s.getName().equals("Jerry"))) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}
