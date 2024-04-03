package org.stack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class Stack<T> {
    private int top;
    private int currentCapacity;
    private T[] stack;

    public Stack(Class<T> clazz) {
        stack = createNewArray(clazz, 5);
        top = -1;
        currentCapacity = 5;
    }

    public int getTop() {
        return top;
    }

    public void push(T value) {
        if (top == currentCapacity - 1) {
            currentCapacity = currentCapacity * 2;
            stack = Arrays.copyOf(stack, currentCapacity);
        }
        stack[++top] = value;
    }

    public T pick() throws StackIsEmptyException {
        if (isEmpty()) throw new StackIsEmptyException();
        return stack[top];
    }

    public T pop() throws StackIsEmptyException {
        if (isEmpty()) throw new StackIsEmptyException();
        T temp = stack[top];
        top--;
        return temp;
    }

    public boolean isEmpty() {
        return Objects.equals(top, -1);
    }

    private T[] createNewArray(Class<T> c, int size) {
        return (T[])Array.newInstance(c, size);
    }
}
