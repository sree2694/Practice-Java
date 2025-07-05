package com.example.java8features;

import com.example.java8features.lambda.EmployeeLambdaDemo.*;
import com.example.java8features.lambda.EmployeeLambdaDemo;
import com.example.java8features.stream.StreamExamples;
import com.example.java8features.optional.OptionalExample;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        // --- Lambda ---
        System.out.println("=== Lambda Expression Demo ===");
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 50000));
        employees.add(new Employee("Bob", 75000));
        employees.add(new Employee("Charlie", 60000));

        EmployeeLambdaDemo.sortEmployeesBySalary(employees);
        EmployeeLambdaDemo.printEmployees(employees);

        EmployeeLambdaDemo.applyBonus(employees, salary -> salary * 0.10);

        // --- Stream API ---
        System.out.println("\n=== Stream API Demo ===");
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Mike", "Jill");
        System.out.println("Names starting with 'J': " + StreamExamples.filterNamesStartingWith(names, "J"));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Squares of even numbers: " + StreamExamples.squareEvenNumbers(numbers));
        System.out.println("Sum of numbers: " + StreamExamples.sumOfList(numbers));

        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        System.out.println("Word frequencies: " + StreamExamples.countWords(words));

        // --- Optional ---
        System.out.println("\n=== Optional Demo ===");
        Optional<String> emailOpt = OptionalExample.getEmail(true);
        OptionalExample.printEmail(emailOpt);

        Optional<String> noEmailOpt = OptionalExample.getEmail(false);
        OptionalExample.printEmail(noEmailOpt);
        System.out.println("Default Email: " + OptionalExample.getEmailOrDefault(noEmailOpt));
    }
}
// This is the main application class that demonstrates the use of Java 8 features such as lambda expressions,
// Stream API, and Optional.
// It includes sorting employees by salary, filtering names, squaring even numbers, summing a list,
// counting word occurrences, and handling optional values.
// The Employee class is defined as a record for simplicity and immutability.