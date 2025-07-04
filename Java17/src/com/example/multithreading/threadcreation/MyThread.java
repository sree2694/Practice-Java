package com.example.multithreading.threadcreation;

public class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running via Thread class: " + Thread.currentThread().getName());
    }
}
// This class extends the Thread class and overrides the run method to provide custom behavior.
// When the thread is started, it will print the name of the current thread.
// This is a simple example of creating a thread by extending the Thread class in Java.