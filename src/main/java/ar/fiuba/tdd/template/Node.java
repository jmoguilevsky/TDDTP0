package ar.fiuba.tdd.template;

/**
 * Created by joni on 8/28/16.
 */
public class Node<T> {
    private Node next;

    public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        next = node;
    }

    private T data;

    public T getData() {
        return data;
    }

    public  Node(T data) {
        this.data = data;
    }
}
