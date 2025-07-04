package com.example.multithreading.producerconsumer;
// This class implements the Producer in the producer-consumer problem.
public class Producer implements Runnable {
    private final Buffer buffer;
     // The buffer where produced items are stored.
    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                buffer.produce(i);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
// This class implements the Producer in the producer-consumer problem.
// It implements the Runnable interface and defines the run method.
// The run method produces items by calling the produce method on the buffer.
// It sleeps for a short duration after producing each item to simulate work being done.
// This allows multiple threads to run concurrently, demonstrating the producer-consumer pattern.