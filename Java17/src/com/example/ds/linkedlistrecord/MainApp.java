package com.example.ds.linkedlistrecord;

import com.example.ds.linkedlistrecord.model.Person;
import com.example.ds.linkedlistrecord.singly.*;
import com.example.ds.linkedlistrecord.utils.LinkedListRecordUtils;

public class MainApp {
    public static void main(String[] args) {
        RecordSinglyLinkedList list = new RecordSinglyLinkedList();

        list.add(new Person(1, "Alice"));
        list.add(new Person(2, "Bob"));
        list.add(new Person(3, "Charlie"));

        System.out.println("Original list:");
        list.traverse();

        list.head = LinkedListRecordUtils.reverse(list.head);
        System.out.println("Reversed list:");
        list.traverse();

        RecordNode middle = LinkedListRecordUtils.findMiddle(list.head);
        System.out.println("Middle person: " + middle.data());
    }
}
// This code demonstrates the usage of a singly linked list with record types in Java.
// It creates a list of Person records, adds some entries, reverses the list, and finds the middle element.
// The RecordSinglyLinkedList class manages the linked list operations, while the LinkedListRecordUtils class provides utility methods for manipulating the list.
// The Person record is used to represent each entry in the linked list, showcasing the benefits of using records for immutable data structures.