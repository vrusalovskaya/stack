package org.stack;

import java.util.Arrays;
import java.util.Objects;

public class Stack {
    private int top;
    private int currentCapacity;
    String[] stack;

    public Stack() {
        stack = new String[5];
        top = -1;
        currentCapacity = 5;
    }

    public int getTop() {
        return top;
    }

    public void push(String value) {
        if (top == currentCapacity - 1) {
            currentCapacity = currentCapacity * 2;
            stack = Arrays.copyOf(stack, currentCapacity);
        }
        stack[++top] = value;
    }

    public String pick() throws StackIsEmptyException {
        if (isEmpty()) throw new StackIsEmptyException();
        return stack[top];
    }

    public String pop() throws StackIsEmptyException {
        if (isEmpty()) throw new StackIsEmptyException();
        String temp = stack[top];
        top--;
        return temp;
    }

    public boolean isEmpty() {
        return Objects.equals(top, -1);
    }

}
