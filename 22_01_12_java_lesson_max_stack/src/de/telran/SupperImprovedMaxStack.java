package de.telran;

import java.util.ArrayDeque;
import java.util.Deque;

public class SupperImprovedMaxStack implements MaxStack {
    public SupperImprovedMaxStack() {
    }
    Deque<Integer> source = new ArrayDeque<>();
    Deque<Integer> currentMaxStack = new ArrayDeque<>();
    @Override
    public void add(int elt) {
        if (source.size() == 0) {
            currentMaxStack.addLast(elt);
        } else if (elt>=currentMaxStack.getLast()){
            currentMaxStack.add(elt);
        }
        source.addLast(elt);
    }

    @Override
    public int get() {
        return source.getLast();
    }

    @Override
    public int remove() {
        return 0;
    }

    @Override
    public int size() {
        return source.size();
    }

    @Override
    public int getMax() {
        return 0;
    }
}
