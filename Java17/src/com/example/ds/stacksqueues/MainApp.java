package com.example.ds.stacksqueues;

import com.example.ds.stacksqueues.stack.*;
import com.example.ds.stacksqueues.queue.*;

public class MainApp {
    public static void main(String[] args) {
        // Stack using array
        System.out.println("=== Stack (Array) ===");
        ArrayStack stack = new ArrayStack(5);
        stack.push(10);
        stack.push(20);
        System.out.println("Top: " + stack.peek());
        System.out.println("Popped: " + stack.pop());

        // Queue using linked list
        System.out.println("\n=== Queue (Linked List) ===");
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println("Dequeued: " + queue.dequeue());

        // Queue using two stacks
        System.out.println("\n=== Queue Using Two Stacks ===");
        QueueUsingStacks q2 = new QueueUsingStacks();
        q2.enqueue(100);
        q2.enqueue(200);
        System.out.println("Dequeued: " + q2.dequeue());

        // Balanced parentheses
        System.out.println("\n=== Balanced Parentheses ===");
        String expr1 = "{[()]}";
        String expr2 = "{[(])}";
        System.out.println(expr1 + " -> " + BalancedParenthesesChecker.isBalanced(expr1));
        System.out.println(expr2 + " -> " + BalancedParenthesesChecker.isBalanced(expr2));
    }
}
// Output:
// === Stack (Array) ===
// Top: 20     