package com.example.oop;

import com.example.oop.animal.*;
import com.example.oop.user.User;
import com.example.oop.config.AppConfig;

// Main application demonstrating OOP concepts in Java 17
// This application showcases inheritance, encapsulation, and the singleton pattern using sealed classes, records, and a singleton class.
public class MainApp {
    public static void main(String[] args) {
        // Sealed class polymorphism
        Animal dog = new Dog();
        Animal cat = new Cat();
        System.out.println(dog.speak());
        System.out.println(cat.speak());

        // Record (Encapsulation/Immutability)
        User user = new User("Alice", 30);
        System.out.println(user);
        System.out.println(user.greet());

        // Singleton
        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();

        config1.printConfig();
        System.out.println("Same instance? " + (config1 == config2)); // true
    }
}

// This is a simple Java application demonstrating OOP concepts like inheritance, encapsulation, and singleton pattern.
// It includes classes for animals (Dog and Cat), a user class, and a singleton configuration class.
// The main method creates instances of these classes and demonstrates their functionality.