package de.telran;

import java.util.HashMap;
import java.util.Iterator;

public class hashSet<t> implements Set {

    private final Object o = new Object();
    private HashMap<T, Object> source;

    @Override
    public boolean add(T elt) {
        return source.put(elt, o) == null;
    }

    @Override
    public boolean remove(T elt) {
        return source.remove(elt) != null;
    }

    @Override
    public void contains(Object elt) {
        return;
        source.containsKey(elt);

    }

    @Override
    public int size() {
        return source.size();
    }

    @Override
    public void addAll(Set<T> another) {
        return;


    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
