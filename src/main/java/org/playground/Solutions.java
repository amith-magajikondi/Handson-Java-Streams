package org.playground;

import java.time.Month;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    // ========================================================================
    // PROBLEM 6: Find second highest distinct salary.
    // ========================================================================
    public static Optional<Double> findSecondHighestSalary(List<Problem6.Employee> employees) {
        return employees.stream()
                .map(Problem6.Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
    }

    // ========================================================================
    // PROBLEM 7: Find first non-repeating character in a string using streams.
    // ========================================================================
    public static Optional<Character> findFirstNonRepeatingChar(String input) {
        if (input == null || input.isEmpty()) {
            return Optional.empty();
        }

        return input.chars()
                .mapToObj(c -> (char) c)
                // Collect into LinkedHashMap to preserve the original string insertion order
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst();
    }

    // ========================================================================
    // PROBLEM 8: Count frequency of each word in a paragraph.
    // ========================================================================
    public static Map<String, Long> countWordFrequency(String paragraph) {
        if (paragraph == null || paragraph.trim().isEmpty()) {
            return Map.of();
        }

        // Split by spaces (handles multiple consecutive spaces as well)
        return Arrays.stream(paragraph.toLowerCase().split("\\s+"))
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ));
    }

    // ========================================================================
    // PROBLEM 9: Group transactions by month and sum amounts.
    // ========================================================================
    public static Map<Month, Double> sumTransactionsByMonth(List<Problem9.Transaction> transactions) {
        return transactions.stream()
                .collect(Collectors.groupingBy(
                        t -> t.getDate().getMonth(),
                        Collectors.summingDouble(Problem9.Transaction::getAmount)
                ));
    }

    // ========================================================================
    // PROBLEM 10: Find top 5 longest strings.
    // ========================================================================
    public static List<String> findTop5LongestStrings(List<String> strings) {
        return strings.stream()
                .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length())) // Descending by length
                .limit(5)
                .collect(Collectors.toList());
    }

    // ========================================================================
    // PROBLEM 11: Convert list of employees to Map handling duplicate IDs.
    // ========================================================================
    public static Map<Integer, Problem11.Employee> convertToMapHandlingDuplicates(List<Problem11.Employee> employees) {
        return employees.stream()
                .collect(Collectors.toMap(
                        Problem11.Employee::getId,
                        employee -> employee,
                        (existing, replacement) -> replacement.getSalary() > existing.getSalary() ? replacement : existing
                ));
    }

    // ========================================================================
    // PROBLEM 12: Find common elements between two lists using streams.
    // ========================================================================
    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        if (list1 == null || list2 == null) {
            return List.of();
        }

        // Converting list2 to a Set optimizes lookups from O(N) to O(1) inside the filter
        java.util.Set<Integer> set2 = new java.util.HashSet<>(list2);

        return list1.stream()
                .filter(set2::contains)
                .distinct() // Ensures output elements are unique if duplicates exist in list1
                .collect(Collectors.toList());
    }

    // ========================================================================
    // PROBLEM 13: Find products never ordered from products and orders collections.
    // ========================================================================
    public static List<Problem13.Product> findNeverOrderedProducts(List<Problem13.Product> products, List<Problem13.Order> orders) {
        if (products == null) return List.of();
        if (orders == null) return products;

        // Collect ordered product IDs into a Set for fast O(1) lookups
        java.util.Set<Integer> orderedProductIds = orders.stream()
                .map(Problem13.Order::getProductId)
                .collect(Collectors.toSet());

        return products.stream()
                .filter(product -> !orderedProductIds.contains(product.getId()))
                .collect(Collectors.toList());
    }

    // ========================================================================
    // PROBLEM 14: Generate first 20 Fibonacci numbers using Stream.iterate().
    // ========================================================================
    public static List<Long> generateFirst20Fibonacci() {
        return Stream.iterate(new long[]{0, 1}, fib -> new long[]{fib[1], fib[0] + fib[1]})
                .limit(20)
                .map(fib -> fib[0])
                .collect(Collectors.toList());
    }

    // ========================================================================
    // PROBLEM 15: Merge multiple lists and preserve encounter order while removing duplicates.
    // ========================================================================
    @SafeVarargs
    public static List<Integer> mergeAndPreserveOrder(List<Integer>... lists) {
        if (lists == null) {
            return List.of();
        }

        return Arrays.stream(lists)
                .flatMap(List::stream)
                .distinct() // distinct() inherently respects the encounter order of sequential streams
                .collect(Collectors.toList());
    }

    // ========================================================================
    // PROBLEM 16: Find average salary by department and sort descending.
    // ========================================================================
    public static Map<String, Double> getAverageSalaryByDeptSorted(List<Problem16.Employee> employees) {
        if (employees == null) {
            return Map.of();
        }

        // 1. Group by department and compute average
        Map<String, Double> unorderedAvgMap = employees.stream()
                .collect(Collectors.groupingBy(
                        Problem16.Employee::getDepartment,
                        Collectors.averagingDouble(Problem16.Employee::getSalary)
                ));

        // 2. Sort entries by value descending and collect into a LinkedHashMap to preserve order
        return unorderedAvgMap.entrySet().stream()
                .sorted((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()))
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> entry.getValue(),
                        (existing, replacement) -> existing,
                        LinkedHashMap::new
                ));
    }

    // ========================================================================
    // PROBLEM 17: Group employees by city then department (nested grouping).
    // ========================================================================
    public static Map<String, Map<String, List<Problem17.Employee>>> groupByCityThenDept(List<Problem17.Employee> employees) {
        if (employees == null) {
            return Map.of();
        }

        return employees.stream()
                .collect(Collectors.groupingBy(
                        Problem17.Employee::getCity,
                        Collectors.groupingBy(Problem17.Employee::getDepartment)
                ));
    }

    // ========================================================================
    // PROBLEM 18: Find duplicate words in a sentence.
    // ========================================================================
    public static List<String> findDuplicateWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return List.of();
        }

        return Arrays.stream(sentence.toLowerCase().split("\\s+"))
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
    }

    // ========================================================================
    // PROBLEM 19: Build a histogram of character frequencies.
    // ========================================================================
    public static Map<Character, Long> buildCharacterHistogram(String input) {
        if (input == null || input.isEmpty()) {
            return Map.of();
        }

        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ') // Exclude whitespace tracking
                .collect(Collectors.groupingBy(
                        character -> character,
                        Collectors.counting()
                ));
    }

    // ========================================================================
    // PROBLEM 20: Summarize integer statistics (min,max,sum,avg,count) for a dataset.
    // ========================================================================
    public static IntSummaryStatistics getIntegerStatistics(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return new IntSummaryStatistics();
        }

        return numbers.stream()
                .mapToInt(Integer::intValue) // Unbox to standard primitive IntStream
                .summaryStatistics();        // Collects count, min, max, sum, and average in O(N) time
    }

    // ========================================================================
    // PROBLEM 21: Find longest word in a text ignoring punctuation.
    // ========================================================================
    public static Optional<String> findLongestWord(String text) {
        if (text == null || text.trim().isEmpty()) {
            return Optional.empty();
        }

        return Arrays.stream(text.split("\\s+"))
                // Remove any leading/trailing or nested punctuation character
                .map(word -> word.replaceAll("[^a-zA-Z0-9]", ""))
                .filter(word -> !word.isEmpty())
                .max((w1, w2) -> Integer.compare(w1.length(), w2.length()));
    }

    // ========================================================================
    // PROBLEM 22: Find all anagram groups from a list of words.
    // ========================================================================
    public static List<List<String>> findAnagramGroups(List<String> words) {
        if (words == null || words.isEmpty()) {
            return List.of();
        }

        return words.stream()
                .collect(Collectors.groupingBy(word -> {
                    // Helper mapping: sort characters of the word to create a normalized anagram key
                    char[] chars = word.toLowerCase().toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }))
                .values() // Extract the List<List<String>> of grouped values
                .stream()
                .filter(group -> group.size() > 1) // Only keep valid matching groups
                .collect(Collectors.toList());
    }

    // ========================================================================
    // PROBLEM 23: Sort employees by department then salary then name.
    // ========================================================================
    public static List<Problem23.Employee> sortEmployeesMultiCriteria(List<Problem23.Employee> employees) {
        if (employees == null) {
            return List.of();
        }

        return employees.stream()
                .sorted(java.util.Comparator.comparing(Problem23.Employee::getDepartment)
                        // Salary descending: note the use of .reversed() or comparingDouble alternative
                        .thenComparing(java.util.Comparator.comparingDouble(Problem23.Employee::getSalary).reversed())
                        .thenComparing(Problem23.Employee::getName))
                .collect(Collectors.toList());
    }

    // ========================================================================
    // PROBLEM 24: Using flatMap(), produce all possible pairs from two lists.
    // ========================================================================
    public static List<String> generateAllPairs(List<String> list1, List<Integer> list2) {
        if (list1 == null || list2 == null) {
            return List.of();
        }

        return list1.stream()
                .flatMap(str -> list2.stream()
                        .map(num -> str + num))
                .collect(Collectors.toList());
    }

    // ========================================================================
    // PROBLEM 25: Compute total revenue per customer using groupingBy + flatMap alternative structures.
    // ========================================================================
    public static Map<String, Double> computeTotalRevenuePerCustomer(List<Problem25.Order> orders) {
        if (orders == null || orders.isEmpty()) {
            return Map.of();
        }

        // Approach: Creating an intermediate stream of combined records or flatMapping directly into map entry collections
        return orders.stream()
                .flatMap(order -> order.getLineItems().stream()
                        .map(item -> new java.util.AbstractMap.SimpleEntry<>(
                                order.getCustomerName(),
                                item.getTotalPrice()
                        )))
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.summingDouble(Map.Entry::getValue)
                ));
    }
}
