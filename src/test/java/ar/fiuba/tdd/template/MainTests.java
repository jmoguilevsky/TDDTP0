package ar.fiuba.tdd.template;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MainTests {

    @Test
    public void dummy() {
        assertEquals(0, 0);
    }

    @Test
    public void anotherDummy() {
        assertEquals(1, 1);
    }

    @Test
    public void createQueueIsEmpty() {
        Queue<Integer> q = new Queue<Integer>();
        assertEquals(q.isEmpty(), true);
    }

    @Test
    public void addElementToQueueIsNotEmpty() {
        Queue<Integer> q = new Queue<Integer>();
        q.add(10);
        assertEquals(q.isEmpty(), false);
    }

    @Test
    public void addElementToQueueSizeIsOne() {
        Queue<Integer> q = new Queue<Integer>();
        q.add(10);
        assertEquals(q.size(), 1);
    }

    @Test
    public void addElementToQueueTopIsElement() {
        Queue<Integer> q = new Queue<Integer>();
        Integer element = 10;
        q.add(element);
        assertEquals(q.top(), element);
    }

    @Test
    public void addElementToQueueRemoveThenIsEmpty() {
        Queue<Integer> q = new Queue<Integer>();
        Integer element = 10;
        q.add(element);
        q.remove();
        assertEquals(q.isEmpty(), true);
    }

    @Test
    public void add10ElementsToQueueTopIsFirst() {
        Queue<Integer> q = new Queue<Integer>();
        for (int i = 0; i < 10; i++) {
            q.add(i);
        }
        Integer zero = 0;
        assertEquals(q.top(), zero);
    }

    @Test
    public void add10ElementsToQueueRemoveSizeIs9() {
        Queue<Integer> q = new Queue<Integer>();
        for (int i = 0; i < 10; i++) {
            q.add(i);
        }
        q.remove();
        assertEquals(q.size(), 9);
    }

    @Test
    public void add10ElementsToQueueRemove10IsEmpty() {
        Queue<Integer> q = new Queue<Integer>();
        for (int i = 0; i < 10; i++) {
            q.add(i);
        }
        for (int i = 0; i < 10; i++) {
            q.remove();
        }
        assertEquals(q.isEmpty(), true);
    }

    @Test(expected=AssertionError.class)
    public void topIfEmptyThrowsException() {
        Queue<Integer> q = new Queue<Integer>();
        q.top();
    }

    @Test(expected=AssertionError.class)
    public void removeIfEmptyThrowsException() {
        Queue<Integer> q = new Queue<Integer>();
        q.remove();
    }

    @Test(expected=AssertionError.class)
    public void add10ElementsToQueueRemove11ThrowsException() {
        Queue<Integer> q = new Queue<Integer>();
        for (int i = 0; i < 10; i++) {
            q.add(i);
        }
        for (int i = 0; i < 11; i++) {
            q.remove();
        }
    }

    @Test
    public void addAndRemove10ElementsToQueueAddAndSizeIsOne() {
        Queue<Integer> q = new Queue<Integer>();
        for (int i = 0; i < 10; i++) {
            q.add(i);
        }
        for (int i = 0; i < 10; i++) {
            q.remove();
        }
        q.add(150);
        assertEquals(q.size(), 1);
    }

    @Test
    public void addAndRemove10ElementsToQueueAddAndIsTop() {
        Queue<Integer> q = new Queue<Integer>();
        for (int i = 0; i < 10; i++) {
            q.add(i);
        }
        for (int i = 0; i < 10; i++) {
            q.remove();
        }
        q.add(150);
        assertEquals(q.top(), new Integer(150));
    }
}
