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
        Queue<Integer> testQ = new Queue<Integer>();
        assertEquals(testQ.isEmpty(), true);
    }

    @Test
    public void addElementToQueueIsNotEmpty() {
        Queue<Integer> testQ = new Queue<Integer>();
        testQ.add(10);
        assertEquals(testQ.isEmpty(), false);
    }

    @Test
    public void addElementToQueueSizeIsOne() {
        Queue<Integer> testQ = new Queue<Integer>();
        testQ.add(10);
        assertEquals(testQ.size(), 1);
    }

    @Test
    public void addElementToQueueTopIsElement() {
        Queue<Integer> testQ = new Queue<Integer>();
        Integer element = 10;
        testQ.add(element);
        assertEquals(testQ.top(), element);
    }

    @Test
    public void addElementToQueueRemoveThenIsEmpty() {
        Queue<Integer> testQ = new Queue<Integer>();
        Integer element = 10;
        testQ.add(element);
        testQ.remove();
        assertEquals(testQ.isEmpty(), true);
    }

    @Test
    public void add10ElementsToQueueTopIsFirst() {
        Queue<Integer> testQ = new Queue<Integer>();
        for (int i = 0; i < 10; i++) {
            testQ.add(i);
        }
        Integer zero = 0;
        assertEquals(testQ.top(), zero);
    }

    @Test
    public void add10ElementsToQueueRemoveSizeIs9() {
        Queue<Integer> testQ = new Queue<Integer>();
        for (int i = 0; i < 10; i++) {
            testQ.add(i);
        }
        testQ.remove();
        assertEquals(testQ.size(), 9);
    }

    @Test
    public void add10ElementsToQueueRemove10IsEmpty() {
        Queue<Integer> testQ = new Queue<Integer>();
        for (int i = 0; i < 10; i++) {
            testQ.add(i);
        }
        for (int i = 0; i < 10; i++) {
            testQ.remove();
        }
        assertEquals(testQ.isEmpty(), true);
    }

    @Test(expected = AssertionError.class)
    public void topIfEmptyThrowsException() {
        Queue<Integer> testQ = new Queue<Integer>();
        testQ.top();
    }

    @Test(expected = AssertionError.class)
    public void removeIfEmptyThrowsException() {
        Queue<Integer> testQ = new Queue<Integer>();
        testQ.remove();
    }

    @Test(expected = AssertionError.class)
    public void add10ElementsToQueueRemove11ThrowsException() {
        Queue<Integer> testQ = new Queue<Integer>();
        for (int i = 0; i < 10; i++) {
            testQ.add(i);
        }
        for (int i = 0; i < 11; i++) {
            testQ.remove();
        }
    }

    @Test
    public void addAndRemove10ElementsToQueueAddAndSizeIsOne() {
        Queue<Integer> testQ = new Queue<Integer>();
        for (int i = 0; i < 10; i++) {
            testQ.add(i);
        }
        for (int i = 0; i < 10; i++) {
            testQ.remove();
        }
        testQ.add(150);
        assertEquals(testQ.size(), 1);
    }

    @Test
    public void addAndRemove10ElementsToQueueAddAndIsTop() {
        Queue<Integer> testQ = new Queue<Integer>();
        for (int i = 0; i < 10; i++) {
            testQ.add(i);
        }
        for (int i = 0; i < 10; i++) {
            testQ.remove();
        }
        testQ.add(150);
        assertEquals(testQ.top(), new Integer(150));
    }
}
