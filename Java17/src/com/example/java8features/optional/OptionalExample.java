package com.example.java8features.optional;

import java.util.Optional;

public class OptionalExample {

    public static Optional<String> getEmail(boolean isPresent) {
        if (isPresent) {
            return Optional.of("user@example.com");
        } else {
            return Optional.empty();
        }
    }

    public static void printEmail(Optional<String> emailOpt) {
        // Use ifPresent
        emailOpt.ifPresentOrElse(
            email -> System.out.println("Email: " + email),
            () -> System.out.println("Email not available")
        );
    }

    public static String getEmailOrDefault(Optional<String> emailOpt) {
        return emailOpt.orElse("default@example.com");
    }
}
// This class demonstrates the use of Optional in Java 8.
// It includes methods to get an email wrapped in an Optional, print the email if present,
// and return a default email if the Optional is empty.
// The use of Optional helps avoid NullPointerExceptions and makes the code more readable.