package ar.fiuba.tdd.template;

/**
 * Created by joni on 8/30/16.
 */
public interface Node<T> {
    public Node<T> getNext();

    public T getData();

    public int getSize();

    public void add(Node<T> node, Node<T> previousLastNode);
}
