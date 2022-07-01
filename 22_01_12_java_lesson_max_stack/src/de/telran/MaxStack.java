package de.telran;

public interface MaxStack {

    void add(int elt);

    int get();

    int remove();

    int size();
    //TODO
    // 1. Impliment at List a simple implimentation of the collection
    // 2. Try to impliment this method so that it has the complexity 0(1).
    // To simplify one can use Java ready collection under the hood.
    int getMax();
}
