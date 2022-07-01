package de.telran;

import java.lang.reflect.Array;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {


    }

    public boolean containsProduct(int[] numbers, int product) {
        double productSqrt = Math.sqrt(product);

        for (int i = 0; numbers.length && (numbers[i] <= productSqrt); i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] * numbers[j] == product) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsProductEFF(int[] numbers, int product) {
        int i = 0;
        int j = numbers.length - 1;

        while (j - i > 0) {

        }
    }

    public String ancode(String str) {
        if (str.length() == 0)
            return "";

        int count = 1;
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i - 1) != str.charAt(i)) {
                if (count > 1) {
                    builder.append(count).append(str.charAt(i - 1));
                    count = 1;
                } else {
                    builder.append(str.charAt(i - 1));
                }
            } else {
                count++;
            }
        }
        if (count == 1) {
            builder.append(str.length() - 1);
        } else
            builder.append(count).append(str.charAt(str.length()) - 1);

        return builder.toString();
    }

    public String decode(String str) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            int digitsNum = 0;
            while (Character.isDigit(str.charAt(i + digitsNum))) {
                digitsNum++;
            }
            if (digitsNum > 0) {
                int charNum = Integer.parseInt(str.substring(i, i + digitsNum));
                builder.append(str.charAt(i + digitsNum));
                i += digitsNum;

                for (int j = 0; j < charNum; j++) {
                    builder.append(str.charAt(i));
                }
            } else {
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }

}
