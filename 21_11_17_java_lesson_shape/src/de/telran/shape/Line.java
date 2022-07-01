package de.telran.shape;

import org.w3c.dom.ls.LSOutput;

public class Line extends Shape {


    final  int length;

    public Line(char symbol, int length) {
        super(symbol);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void draw() {

    }

}
