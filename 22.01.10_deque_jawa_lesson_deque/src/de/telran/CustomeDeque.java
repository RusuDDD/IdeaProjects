package de.telran;

public interface CustomeDeque<T> extends Iterable<T>{

    void addFirst(T elt);

    T getFirst() throws NoSuchFieldException;

    T removeFirst();

    void addLast(T elt);

    T getLast() throws NoSuchFieldException;

    T removeLast();

    int size();
}
