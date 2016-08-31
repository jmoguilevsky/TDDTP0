package ar.fiuba.tdd.template;

/**
 * Created by joni on 8/30/16.
 */
public class NullListNode<T> implements ListNode<T> {

    public ListNode<T> getNext() {
        throw new AssertionError();
    }

    public void setNext(ListNode<T> listNode) {

    }

    public T getData() {
        throw new AssertionError();
    }

    public int getSize() {
        return 0;
    }

    public void add(ListNode<T> listNode) {

    }

}
