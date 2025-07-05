package com.example.ds.linkedlistrecord.singly;

import com.example.ds.linkedlistrecord.model.Person;

public class RecordSinglyLinkedList {
    public RecordNode head;

    public void add(Person data) {
        RecordNode newNode = new RecordNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        RecordNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    public void traverse() {
        RecordNode temp = head;
        while (temp != null) {
            System.out.print(temp.data() + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
// Additional methods like delete, reverse, findMiddle, etc. can be added similarly
// as in the SinglyLinkedList class, but adapted for the record type structure.