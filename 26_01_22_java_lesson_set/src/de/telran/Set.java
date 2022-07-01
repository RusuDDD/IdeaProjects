package de.telran;

public interface Set<T> extends Iterable<T> {
    /**
     *
     * @param elt
     * @return whether the element did not exist in the set
     */
    boolean add(T elt);

    /**
     *
     * @param elt
     * @return true if the elt was removed
     */
    boolean remove(T elt);

    void contains(T elt);

    int size();

    void addAll(T elt);

}
