package de.telran;

import java.util.Arrays;
import java.util.Iterator;

public class IncreassingArrayIterator implements Iterator<Integer> {

    private final int[] array;

    public IncreassingArrayIterator(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
        Arrays.sort(this.array);
    }

    @Override
    public boolean hasNext() {
        return currentIndex<array.length;
    }

    @Override
    public Integer next() {
        int res = array[currentIndex];
        currentIndex++;
        return res;
    }
}
