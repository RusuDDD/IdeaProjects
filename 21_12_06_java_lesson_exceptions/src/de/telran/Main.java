package de.telran;

public class Main {

    public static void main(String[] args) {

        System.out.println(divide(10, 3));//3
        // System.out.println(divide(10, 0));//?
        try {
            int res = dividedManualExceptionWrapper(10, 0);
            System.out.println(res);//?
            System.out.println(divideManualException(10, 0));//?
            System.out.println("Code after division");

        } catch (RuntimeException e) {
            System.out.println("Inside runtime exception");
        }

        //} catch (CustomArithmeticException | ArithmeticException e) {
        //  System.out.println("Caugth CustomArithmeticException");
        // } catch (ArithmeticException e) {
        //   System.out.println("Cougth ArithmeticException");

       System.out.println(divide(10,2));//5
}
    /**
     * return the result by dividing a over b.
     *
     * @param a
     * @param b
     */
    public static int divide(int a, int b) {
        int res = a / b;

        return res;

    }

    public static int dividedManualExceptionWrapper(int a, int b) {
        return divideManualException(a, b);
    }

    public static int divideManualException(int a, int b) throws CustomArithmeticException {
        if (b == 0)
            throw new CustomArithmeticException();
        return a / b;

    }
}
