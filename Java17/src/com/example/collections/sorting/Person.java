package com.example.collections.sorting;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Compare by name (alphabetical)
    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    // Age comparator
    public static java.util.Comparator<Person> byAge() {
        return java.util.Comparator.comparingInt(Person::getAge);
    }

    public String getName() { return name; }

    public int getAge() { return age; }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person p)) return false;
        return age == p.age && Objects.equals(name, p.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
// Compare this snippet from Java17/src/com/example/collections/sorting/PersonTest.java:
// // import org.junit.jupiter.api.Test;
// // import static org.junit.jupiter.api.Assertions.*;