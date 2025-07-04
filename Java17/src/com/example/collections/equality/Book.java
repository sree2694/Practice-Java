package com.example.collections.equality;

import java.util.Objects;

public class Book {
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Important for using in HashSet/HashMap
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book b)) return false;
        return Objects.equals(title, b.title) && Objects.equals(author, b.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author;
    }
}
// Compare this snippet from Java17/src/com/example/collections/equality/BookTest.java:
// // import org.junit.jupiter.api.Test;
// // import static org.junit.jupiter.api.Assertions.*;