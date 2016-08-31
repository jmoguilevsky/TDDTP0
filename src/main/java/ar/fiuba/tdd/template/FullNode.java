package ar.fiuba.tdd.template;

/**
 * Created by joni on 8/28/16.
 */
class FullNode<T> extends Node<T> {

    public void add(Node<T> node, Node<T> previousLastNode) {
        next.add(node, this);
    }

    public T getData() {
        return data;
    }

    public FullNode(T data) {
        this.data = data;
        next = new NullNode<T>();
    }

    public int getSize() {
        return 1 + next.getSize();
    }
}
