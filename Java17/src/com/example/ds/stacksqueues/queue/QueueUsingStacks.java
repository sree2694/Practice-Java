package com.example.ds.stacksqueues.queue;

import java.util.Stack;

public class QueueUsingStacks {
    private final Stack<Integer> stack1 = new Stack<>();
    private final Stack<Integer> stack2 = new Stack<>();
     // Constructor to initialize an empty queue
    public void enqueue(int value) {
        stack1.push(value);
    }
     // Dequeue operation: pop from stack2 if not empty, otherwise transfer elements from stack1 to stack2
    // and then pop from stack2
    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
        }
           // If stack2 is still empty, it means the queue is empty
        if (stack2.isEmpty())
            throw new RuntimeException("Queue is empty");
            // Return the top element from stack2
        return stack2.pop();
    }

    public boolean isEmpty() {     
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
