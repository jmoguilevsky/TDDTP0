package ar.fiuba.tdd.template;

/**
 * Created by joni on 8/28/16.
 */
public class FullListNode<T> implements ListNode<T> {
    private ListNode<T> next = new NullListNode<T>();

    public ListNode<T> getNext() {
        return next;
    }

    public void setNext(ListNode<T> listNode) {
        next = listNode;
    }

    public void add(ListNode<T> listNode) {
        next.add(listNode);
    }

    private T data;

    public T getData() {
        return data;
    }

    public FullListNode(T data) {
        this.data = data;
    }

    public int getSize() {
        return 1 + next.getSize();
    }
}
