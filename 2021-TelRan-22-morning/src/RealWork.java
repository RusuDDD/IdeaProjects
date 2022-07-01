public class RealWork {
    public static void main(String[] args) {
        squareArea();
        squarePerimeter();
        addition();
        subtraction();
        multiplication();
        division();
        rectangleArea();
        rectanglePerimeter();


    }

    public static void squareArea() {
        int size = 30;
        int Rezult = size * size;
        System.out.println(Rezult);

    }

    public static void squarePerimeter() {
        int size = 30;
        int Perimeter = 4 * size;
        System.out.println(Perimeter);

    }

    public static void addition() {
        int size = 10;
        int addition = 5 + 5;
        System.out.println(addition);
    }

    public static void subtraction() {
        int sixe = 20;
        int subtraction = 40 - 20;
        System.out.println(subtraction);
    }

    public static void multiplication() {
        int sixe = 20;
        int multiplication = 10 * 2;
        System.out.println(multiplication);
    }

    public static void division() {
        int sixe = 20;
        int division = 100 / 20;
        System.out.println(division);
    }

    public static void rectangleArea() {
        int a = 10;
        int b = 15;
        int Area = 2 * (10 + 7);
        System.out.println(Area);

    }

    public static void rectanglePerimeter() {
        int a = 10;
        int b = 15;
        int Perimeter = 10 * 7;
        System.out.println(Perimeter);
    }
}