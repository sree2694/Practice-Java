package com.example.oop.animal;

public sealed abstract class Animal permits Dog, Cat {
    public abstract String speak();
}
// This is a sealed class named Animal that can only be extended by Dog and Cat classes.
// It defines an abstract method speak() that must be implemented by the subclasses.
// Sealed classes are used to control which classes can extend them, providing a more controlled inheritance hierarchy.