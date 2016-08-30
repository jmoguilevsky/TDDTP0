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
        Node<T> newNode = new Node<T>(data);
        if (isEmpty()) {
            firstNode = newNode;
        } else {
            lastNode.setNext(newNode);
        }
        lastNode = newNode;
        elementsCount++;
    }

    public T top() throws AssertionError {
        throwExceptionIfEmpty();
        return firstNode.getData();
    }

    public void remove() throws AssertionError {
        throwExceptionIfEmpty();
        firstNode = firstNode.getNext();
        elementsCount--;
    }

    private void throwExceptionIfEmpty() {
        if (isEmpty()) {
            throw new AssertionError("The list is empty");
        }
    }
}

