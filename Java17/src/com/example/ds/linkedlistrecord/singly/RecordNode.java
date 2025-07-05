package com.example.ds.linkedlistrecord.singly;

import com.example.ds.linkedlistrecord.model.Person;

public class RecordNode {
    public Person data;
    public RecordNode next;

    public RecordNode(Person data) {
        this.data = data;
    }
}
// This class represents a node in a singly linked list that uses a record type for its data.
// It contains a reference to the next node and a record type for the data, which is immutable.
// The RecordNode class can be used to create a linked list of Person records, allowing for efficient storage and retrieval of person data.