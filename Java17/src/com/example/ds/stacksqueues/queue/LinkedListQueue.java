package com.example.ds.stacksqueues.queue;

import com.example.ds.stacksqueues.node.Node;

public class LinkedListQueue {
    private Node<Integer> front, rear;
     // Constructor to initialize an empty queue
    public void enqueue(int value) {    
        Node<Integer> newNode = new Node<>(value);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {    
        if (front == null)
            throw new RuntimeException("Queue underflow");
        int value = front.data;
        front = front.next;
        if (front == null) rear = null;
        return value;
    }

    public boolean isEmpty() {
        return front == null;
    }
}
