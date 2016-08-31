package ar.fiuba.tdd.template;

/**
 * Created by joni on 8/28/16.
 */

public class Queue<T> {

    private FirstNode<T> firstNode;

    public Queue() {
        firstNode = new FirstNode<T>();
    }

    public int size() {
        return firstNode.getSize();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void add(T data) {
        firstNode.add(new FullNode<T>(data), firstNode);
    }

    public T top() throws AssertionError {
        return firstNode.getData();
    }

    public void remove() throws AssertionError {
        firstNode.remove();
    }
}

