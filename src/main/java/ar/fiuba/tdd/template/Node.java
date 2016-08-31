package ar.fiuba.tdd.template;

/**
 * Created by joni on 8/30/16.
 */
public abstract class Node<T> {
    protected T data;

    protected Node<T> next;

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> node) {
        next = node;
    }

    public abstract T getData();

    public abstract int getSize();

    public abstract void add(Node<T> node, Node<T> previousLastNode);
}
