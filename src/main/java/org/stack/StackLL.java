package org.stack;

public class StackLL<T> {

    private class Node {
        T data;
        Node next;

        Node (T data){
            this.data = data;
            next = null;
        }

        public Node getNext() {
            return next;
        }

        public T getData() {
            return data;
        }
    }

    Node root;

    public void push (T value){
        Node newNode = new Node(value);
        newNode.next = root;
        root = newNode;
    }

    public T pick() throws StackIsEmptyException {
        if (isEmpty()) throw new StackIsEmptyException();
        return root.data;
    }

public T pop() throws StackIsEmptyException {
    if (isEmpty()) throw new StackIsEmptyException();
    T temp = root.data;
    root = root.next;
    return temp;
}

    public boolean isEmpty(){
        return root == null;
    }

}
