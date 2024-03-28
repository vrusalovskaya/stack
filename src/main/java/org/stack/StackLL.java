package org.stack;

public class StackLL {

    private class Node {
        String data;
        Node next;

        Node (String data){
            this.data = data;
            next = null;
        }

        public Node getNext() {
            return next;
        }

        public String getData() {
            return data;
        }
    }

    Node root;

    public void push (String value){
        Node newNode = new Node(value);
        newNode.next = root;
        root = newNode;
    }

    public String pick() throws StackIsEmptyException {
        if (isEmpty()) throw new StackIsEmptyException();
        return root.data;
    }

public String pop() throws StackIsEmptyException {
    if (isEmpty()) throw new StackIsEmptyException();
    String temp = root.data;
    root = root.next;
    return temp;
}

    public boolean isEmpty(){
        return root == null;
    }

}
