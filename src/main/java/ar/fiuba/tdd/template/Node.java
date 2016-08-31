package ar.fiuba.tdd.template;

/**
 * Created by joni on 8/30/16.
 */
public abstract class Node<T> {
    protected Node<T> next = new NullNode<T>();

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> node) {
        next = node;
    }

    protected T data;

    public T getData() {
        return data;
    }

    public abstract int getSize();

    public abstract void add(Node<T> node, Node<T> previousLastNode);
}
