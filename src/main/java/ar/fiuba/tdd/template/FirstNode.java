package ar.fiuba.tdd.template;

/**
 * Created by joni on 8/31/16.
 */
class FirstNode<T> extends Node<T> {

    public FirstNode() {
        next = new NullNode<T>();
    }

    public void add(Node<T> node, Node<T> previousLastNode) {
        next.add(node, this);
    }

    private T data;

    public T getData() {
        return next.getData();
    }

    public int getSize() {
        return next.getSize();
    }

    public void remove() {
        next = next.getNext();
    }
}
