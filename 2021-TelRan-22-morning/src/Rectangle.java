public class Rectangle {
    public static void main(String[] args) {
        rectangleArea();
        rectanglePerimeter();

    }

    public static void rectangleArea() {
        int a = 10;
        int b = 15;
        int area = 2 * (a + b);
        System.out.println(area);

    }

    public static void rectanglePerimeter() {
        int a = 10;
        int b = 15;
        int perimeter = a * b;
        System.out.println(perimeter);
    }

}
