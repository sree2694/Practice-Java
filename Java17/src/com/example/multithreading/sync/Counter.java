package com.example.multithreading.sync;

public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
// This class represents a simple counter that can be incremented in a thread-safe manner.
// The increment method is synchronized to ensure that only one thread can modify the count at a time.
// The getCount method returns the current value of the count.
// This is useful in multithreaded applications where multiple threads may try to update the same counter concurrently.