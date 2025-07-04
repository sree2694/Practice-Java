package com.example.multithreading.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;
// This class implements a simple producer-consumer problem using a buffer.
public class Buffer {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == capacity) {
            wait();
        }
        queue.add(value);
        System.out.println("Produced: " + value);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        int value = queue.poll();
        System.out.println("Consumed: " + value);
        notifyAll();
        return value;
    }
}
// This class represents a buffer used in the producer-consumer problem.
// It uses a queue to store produced items and has methods for producing and consuming items.
// The produce method adds an item to the buffer, waiting if the buffer is full.
// The consume method removes an item from the buffer, waiting if the buffer is empty.
// Both methods are synchronized to ensure thread safety, and they notify waiting threads when the state changes.