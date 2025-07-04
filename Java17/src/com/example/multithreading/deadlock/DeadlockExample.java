package com.example.multithreading.deadlock;

public class DeadlockExample {
     // Two locks to create a deadlock scenario
    // Each task tries to acquire locks in a different order, leading to a deadlock. 
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void task1() {
        synchronized (lock1) {
            System.out.println("Thread 1: Holding lock1...");
            try { Thread.sleep(100); } catch (InterruptedException ignored) {}
            synchronized (lock2) {
                System.out.println("Thread 1: Holding lock1 & lock2...");
            }
        }
    }

    public void task2() {
        synchronized (lock2) {
            System.out.println("Thread 2: Holding lock2...");
            try { Thread.sleep(100); } catch (InterruptedException ignored) {}
            synchronized (lock1) {
                System.out.println("Thread 2: Holding lock2 & lock1...");
            }
        }
    }

    public static void createDeadlock() {
        DeadlockExample deadlock = new DeadlockExample();
        new Thread(deadlock::task1).start();
        new Thread(deadlock::task2).start();
    }
}
// This class demonstrates a deadlock scenario in Java.
// It has two methods, task1 and task2, which try to acquire locks on two objects in different orders.
// When two threads run these methods simultaneously, they can end up waiting for each other indefinitely,
// resulting in a deadlock situation.
// The createDeadlock method starts two threads that execute task1 and task2, leading to a deadlock.