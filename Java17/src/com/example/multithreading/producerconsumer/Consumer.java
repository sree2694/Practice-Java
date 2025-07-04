package com.example.multithreading.producerconsumer;
// This class implements the Consumer in the producer-consumer problem.
public class Consumer implements Runnable {
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                buffer.consume();
                Thread.sleep(150);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
// This class implements the Consumer in the producer-consumer problem.
// It implements the Runnable interface and defines the run method.
// The run method consumes items by calling the consume method on the buffer.
// It sleeps for a short duration after consuming each item to simulate work being done.
// This allows multiple threads to run concurrently, demonstrating the producer-consumer pattern.