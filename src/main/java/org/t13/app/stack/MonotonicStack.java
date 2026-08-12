package org.t13.app.stack;

import java.util.Stack;

public class MonotonicStack {

    static void main() {
        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.push('e');

        for(char i : stack) {
            System.out.println(i);
        }
        for(int i = stack.size() - 1; i >= 0; i--) {
            System.out.println("Peeking === " + stack.peek());
            System.out.println("Popping === " + stack.pop());
        }
    }
}
