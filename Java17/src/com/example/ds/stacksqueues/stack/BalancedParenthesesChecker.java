package com.example.ds.stacksqueues.stack;

import java.util.Stack;

public class BalancedParenthesesChecker {
    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
            // Iterate through each character in the expression
        for (char ch : expr.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) return false;
            }
        }
            // If stack is empty, all parentheses were matched
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
