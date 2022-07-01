package de.telran.shape;

public class Rectangle extends Shape {

    final int width;
    final int heigth;
    final Line line;

    public Rectangle(char symbol, int width, int heigth) {
        super(symbol);
        this.width = width;
        this.heigth = heigth;
        line = new Line(symbol, width);


    }

    public int getWidth() {
        return width;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    public void draw() {
        for (int i = 0; i < heigth; i++) {

        }

    }
}
