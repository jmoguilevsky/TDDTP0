package ar.fiuba.tdd.template;

import org.junit.Test;

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
    public void createQueue() {
        Queue<Integer> q = new Queue<Integer>();
        assertEquals(q.isEmpty(), true);
    }
}
