package ar.fiuba.tdd.template;

/**
 * Created by joni on 8/28/16.
 */
public class FullNode<T> implements Node<T> {
    private Node<T> next = new NullNode<T>();

    public Node<T> getNext() {
        return next;
    }

    public void add(Node<T> node, Node<T> previousLastNode) {
        next.add(node, this);
    }

    private T data;

    public T getData() {
        return data;
    }

    public FullNode(T data) {
        this.data = data;
    }

    public int getSize() {
        return 1 + next.getSize();
    }
}
