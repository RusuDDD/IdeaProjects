import static java.lang.Math.PI;

public class AreaCircle {
    public static void main(String[] args) {
        double areaCircle = findAreaCircle(8);
        System.out.println("area circle : = " + areaCircle);
        double m = findLenghtCircle(20);
        System.out.println("lenght circle : = " + m);
    }

    public static double findAreaCircle(double r) {
        return Math.PI * r * r;
    }

    public static double findLenghtCircle(double l) {
        return l * l / 4 * Math.PI;
    }
}
