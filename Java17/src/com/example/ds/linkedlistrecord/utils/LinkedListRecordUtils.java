package com.example.ds.linkedlistrecord.utils;

import com.example.ds.linkedlistrecord.singly.RecordNode;

public class LinkedListRecordUtils {

    public static RecordNode reverse(RecordNode head) {
        RecordNode prev = null, curr = head;
        while (curr != null) {
            RecordNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static RecordNode findMiddle(RecordNode head) {
        RecordNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
// This utility class provides methods for manipulating linked lists that use record types.
// It includes methods to reverse a linked list and find the middle node of a linked list.
// The methods operate on RecordNode objects, which are nodes containing immutable data records.
// This allows for efficient and type-safe operations on linked lists in Java.