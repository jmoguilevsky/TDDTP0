package ar.fiuba.tdd.template;

/**
 * Created by joni on 8/31/16.
 */
public class FirstNode<T> extends Node<T> {

    public void add(Node<T> node, Node<T> previousLastNode) {
        next.add(node, this);
    }

    public T getData() {
        return next.data;
    }

    public int getSize() {
        return next.getSize();
    }

    public void remove() {
        next = next.getNext();
    }
}
