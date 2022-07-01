package de.telran;

public class Point implements Comparable<Point> {
    int value;
    boolean isLeft;

    @Override
    public int compareTo(Point anothePoint) {
        //TODO consider isLeft in the comparison
        return this.value - anothePoint.value;
    }

}
