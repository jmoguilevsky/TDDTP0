package ar.fiuba.tdd.template;

/**
 * Created by joni on 8/30/16.
 */
public interface ListNode<T> {
    public ListNode<T> getNext();

    public void setNext(ListNode<T> listNode);

    public T getData();

    public int getSize();

    public void add(ListNode<T> listNode);
}
