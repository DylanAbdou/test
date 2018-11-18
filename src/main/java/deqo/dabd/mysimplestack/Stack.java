package deqo.dabd.mysimplestack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EmptyStackException;

public class Stack implements SimpleStack {

    private ArrayList<Item> liste = new ArrayList<Item>();

    public Stack() {
    }

    /*public ArrayList<Item> getListe() {
        return this.liste;
    }
    */

    public boolean isEmpty() {
        return this.liste.isEmpty();
    }

    public int getSize() {
        return liste.size();
    }

    public void push(Item item) {
        this.liste.add(0, item);
    }

    public Item peek() throws EmptyStackException {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        } else {
            return this.liste.get(0);
        }
    }

    public Item pop() throws EmptyStackException {
        if (this.isEmpty()) {
            throw new EmptyStackException();

        } else {
            return this.liste.remove(0);
        }
    }
}

