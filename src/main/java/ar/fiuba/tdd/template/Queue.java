package ar.fiuba.tdd.template;

/**
 * Created by joni on 8/28/16.
 */

public class Queue<T> {

    private ListNode<T> firstListNode;

    public Queue() {
        firstListNode = new NullListNode<T>();
    }

    public int size() {
        return firstListNode.getSize();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void add(T data) {
        firstListNode.setNext(new FullListNode<T>(data));
    }

    public T top() throws AssertionError {
        return firstListNode.getData();
    }

    public void remove() throws AssertionError {
        firstListNode = firstListNode.getNext();
    }
}

