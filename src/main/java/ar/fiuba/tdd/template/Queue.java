package ar.fiuba.tdd.template;

/**
 * Created by joni on 8/28/16.
 */

public class Queue<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;

    private int elementsCount;

    public Queue() {

    }

    public int size() {
        return elementsCount;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void add(T data) {
        Node<T> newNode = new Node(data);
        if (isEmpty()) {
            firstNode = newNode;
            lastNode = firstNode;
        } else {
            lastNode.setNext(newNode);
        }
        elementsCount++;
    }

    public T top() throws AssertionError {
        try {
            return lastNode.getData();
        } catch (Exception ex) {
            throw new AssertionError("The list is empty");
        }
    }

    public void remove() throws AssertionError {
        if (isEmpty()) {
            throw new AssertionError("The list is empty");
        }
        Node<T> currentNode = firstNode;
        while (currentNode.getNext() != lastNode && currentNode != lastNode) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(null);
        elementsCount--;
    }
}

