package com.example.oop.user;

public record User(String name, int age) {
    // You can define extra methods if needed
    public String greet() {
        return "Hello, " + name + "!";
    }
}
