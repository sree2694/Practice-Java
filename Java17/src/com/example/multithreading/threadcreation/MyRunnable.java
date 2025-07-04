package com.example.multithreading.threadcreation;

public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread running via Runnable interface: " + Thread.currentThread().getName());
    }
}
// This class implements the Runnable interface and overrides the run method to provide custom behavior.
// When the thread is started, it will print the name of the current thread.
// This is a simple example of creating a thread by implementing the Runnable interface in Java.
// The run method contains the code that will be executed when the thread is started.