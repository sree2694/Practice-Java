package com.example.ds.linkedlistrecord.model;

public record Person(int id, String name) {}
// This record class represents a Person with an id and a name.
// It is immutable and provides a concise way to define data structures in Java.
// Records automatically generate equals(), hashCode(), and toString() methods.