package org.stack;

import java.util.Objects;

public class Stack {
    private int top;
    private final int capacity;
    String stack[];

    public Stack(int size) {
        stack = new String[size];
        top = -1;
        capacity = size;
    }

    public int getTop() {
        return top;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getTopValue() {
        return stack[top];
    }

    public boolean push(String value) {
        if (isFull()) {
            return false;
        } else {
            stack[++top] = value;
            return true;
        }
    }

    public String pick() {
        if (isEmpty()) {
            return "false";
        } else {
            return stack[top];
        }
    }

    public String pop() {
        if (isEmpty()) {
            return "false";
        } else {
            String temp = stack[top];
            top--;
            return temp;
        }
    }

    public boolean isFull() {
        return Objects.equals(top, capacity - 1);
    }

    public boolean isEmpty() {
        return Objects.equals(top, -1);
    }


}
