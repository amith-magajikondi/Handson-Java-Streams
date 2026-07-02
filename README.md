# Java Streams & Collections Practice Playground

A structured, hands-on practice repository designed to master **Java 8+ Streams** and the **Collections Framework**. This project contains 25 meticulously curated problems ranging from basic transformations to complex multi-level reductions, data grouping, and performance-optimized lookups.

## 🎯 Purpose of the Project

The core purpose of this repository is to build strong muscle memory and deep conceptual understanding of declarative programming in Java. By decoupling problem definitions from their underlying solutions, this layout allows you to:
1. **Practice Iteratively:** Write solutions inside blank template files (`Problem1.java` through `Problem25.java`) and use the built-in `main` test runners to instantly verify your implementations.
2. **Master Key Stream Mechanics:** Move beyond simple loops to naturally use `map`, `filter`, `flatMap`, `reduce`, `distinct`, `sorted`, and custom `Collectors` (`groupingBy`, `toMap`, `averagingDouble`, etc.).
3. **Bridge Theory & Production:** Learn how real-world data patterns (like transactions, employee trees, and word histograms) are parsed cleanly, efficiently, and safely against null values or duplicate keys.

---

## 📚 Table of Contents: The 25 Practice Problems

Below is the definitive index of all 25 challenges included within this playground, organized sequentially by track focus:

### Track 1: Basic Filtering, Mapping & Reductions
* **Problem 1:** Filter even numbers and multiply by 2
* **Problem 2:** Convert strings to uppercase and filter by length
* **Problem 3:** Find maximum and minimum in a list of integers
* **Problem 4:** Sum of all elements in a list using reduction
* **Problem 5:** Count strings starting with a specific letter

### Track 2: Advanced Slicing & Frequency Analytics
* **Problem 6:** Find second highest distinct salary
* **Problem 7:** Find first non-repeating character in a string using streams
* **Problem 8:** Count frequency of each word in a paragraph
* **Problem 9:** Group transactions by month and sum amounts
* **Problem 10:** Find top 5 longest strings

### Track 3: Structural Transformations & Key Handling
* **Problem 11:** Convert list of employees to Map handling duplicate IDs
* **Problem 12:** Find common elements between two lists using streams
* **Problem 13:** Find products never ordered from products and orders collections
* **Problem 14:** Generate first 20 Fibonacci numbers using `Stream.iterate()`
* **Problem 15:** Merge multiple lists and preserve encounter order while removing duplicates

### Track 4: Complex Aggregations & Nested Hierarchies
* **Problem 16:** Find average salary by department and sort descending
* **Problem 17:** Group employees by city then department (nested grouping)
* **Problem 18:** Find duplicate words in a sentence
* **Problem 19:** Build a histogram of character frequencies
* **Problem 20:** Summarize integer statistics (min, max, sum, avg, count) for a dataset

### Track 5: Real-World Domain & Collection Intersection
* **Problem 21:** Find longest word in a text ignoring punctuation
* **Problem 22:** Find all anagram groups from a list of words
* **Problem 23:** Sort employees by department then salary then name
* **Problem 24:** Using `flatMap()`, produce all possible pairs from two lists
* **Problem 25:** Given orders with line items, compute total revenue per customer using `groupingBy` + `flatMap`

---

## 💡 Instant Verification / Peek at Solutions
If you want to instantly run the provided solution variations directly inside your execution tests, you can skip the placeholder method by prepending the static `Solutions` reference class to whatever function is being called in `main`.

For example, swap out the local call for the completed static version:

```
// Route execution straight to the completed solution block:
List<String> result = Solutions.getHighEarnersSortedBySalary(employees);
```