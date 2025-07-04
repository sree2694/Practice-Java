package com.example.collections;

import com.example.collections.frequency.FrequencyCounter;
import com.example.collections.sorting.Person;
import com.example.collections.equality.Book;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        // Frequency Counter
        String text = "java java python java code";
        System.out.println("Word frequency:");
        FrequencyCounter.wordFrequency(text).forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("\nCharacter frequency:");
        FrequencyCounter.charFrequency("programming").forEach((k, v) -> System.out.println(k + ": " + v));

        // Sorting
        List<Person> people = new ArrayList<>(List.of(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
        ));

        System.out.println("\nSorted by name:");
        Collections.sort(people);
        people.forEach(System.out::println);

        System.out.println("\nSorted by age:");
        people.sort(Person.byAge());
        people.forEach(System.out::println);

        // hashCode and equals (HashSet)
        Set<Book> books = new HashSet<>();
        books.add(new Book("Effective Java", "Joshua Bloch"));
        books.add(new Book("Clean Code", "Robert Martin"));
        books.add(new Book("Effective Java", "Joshua Bloch")); // duplicate

        System.out.println("\nBooks in HashSet (no duplicates):");
        books.forEach(System.out::println);
    }
}
// This is the main application that demonstrates the use of collections in Java.
// It includes frequency counting, sorting, and equality checks using hashCode and equals.
// The code is structured to be clear and concise, showcasing the key features of Java collections. 