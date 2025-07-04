package com.example.oop.animal;

public final class Cat extends Animal {
    @Override
    public String speak() {
        return "Cat meows";
    }
}
// This class extends the Animal class and implements the speak method to return a string indicating that the cat meows.
// It is marked as final, meaning it cannot be subclassed further.
// This is a simple example of inheritance and method overriding in Java OOP.