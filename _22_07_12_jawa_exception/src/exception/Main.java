package exception;

public class Main {
    public static void main(String[] args) {

        // exception - try ,catch , finally , throw ,throws
        int res;
        try {
            res = div(10, 0);
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Error: by 0 div you cnn't doing");
        }
    }
    public static int div(int a, int b) throws ArithmeticException {
        int res = 0;
        res = a / b;
        return res;
    }
}
