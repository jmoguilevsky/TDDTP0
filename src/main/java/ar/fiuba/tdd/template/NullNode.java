package ar.fiuba.tdd.template;

/**
 * Created by joni on 8/30/16.
 */
public class NullNode<T> implements Node<T> {

    public Node<T> getNext() {
        throw new AssertionError();
    }

    public T getData() {
        throw new AssertionError();
    }

    public int getSize() {
        return 0;
    }

    public void add(Node<T> node, Node<T> previousLastNode) {
        previousLastNode = node;
    }

}
