package com.example.java8features.lambda;

import java.util.*;

public class EmployeeLambdaDemo {
    public static void sortEmployeesBySalary(List<Employee> employees) {
        // Lambda expression with Comparator
        employees.sort((e1, e2) -> Double.compare(e2.salary(), e1.salary()));
    }

    public static void printEmployees(List<Employee> employees) {
        employees.forEach(emp -> System.out.println(emp.name() + " earns " + emp.salary()));
    }

    // Custom functional interface
    @FunctionalInterface
    public interface BonusCalculator {
        double calculateBonus(double salary);
    }

    public static void applyBonus(List<Employee> employees, BonusCalculator bonusCalc) {
        for (Employee emp : employees) {
            double bonus = bonusCalc.calculateBonus(emp.salary());
            System.out.println(emp.name() + " bonus: " + bonus);
        }
    }

    public record Employee(String name, double salary) {}
}
// This class demonstrates the use of lambda expressions and functional interfaces in Java 8.
// It includes methods to sort employees by salary, print employee details, and apply a bonus calculation using a custom functional interface.
// The Employee class is defined as a record for simplicity and immutability.