package com.example.ds.stacksqueues.stack;

public class ArrayStack {
    private final int[] stack;
    private int top;
     // Constructor to initialize the stack with a given size
    public ArrayStack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == stack.length - 1)
            throw new RuntimeException("Stack overflow");
        stack[++top] = value;
    }

    public int pop() {
        if (top == -1)
            throw new RuntimeException("Stack underflow");
        return stack[top--];
    }

    public int peek() {
        if (top == -1)
            throw new RuntimeException("Stack is empty");
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
