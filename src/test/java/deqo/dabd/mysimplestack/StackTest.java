package deqo.dabd.mysimplestack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class StackTest {

    public Stack s;
    public App app;
    public Item item;
    //fixture
    @Before
    public void setUp() throws Exception {
    s = new Stack();
    app = new App();
    item = new Item(0);
    }

    @After
    public void tearDown() throws Exception {
        s = null;
    }

    @Test
    public void testItemSetValeur() {  item.setValeur(1); assertEquals(1,item.getValeur());
    }

    @Test
    public void isEmpty() {
        assertTrue(s.isEmpty());
    }

    @Test
    public void getSize() {
        assertEquals(0,s.getSize());
    }

    @Test
    public void push() {
        s.push(new Item(0));
        assertEquals(1,s.getSize());
    }

    @Test
    public void peek() {
        s.push(new Item(1));
        assertEquals(1,s.peek().getValeur());
    }

    @Test(expected = EmptyStackException.class)
    public void peekError() {
        s.peek().getValeur();
    }

    @Test
    public void pop() {
        s.push(new Item(1));
        assertEquals(1,s.pop().getValeur());
        assertTrue(s.isEmpty());
    }

    @Test(expected = EmptyStackException.class)
    public void popError() {
        assertTrue(s.isEmpty());
        s.pop().getValeur();
    }
}