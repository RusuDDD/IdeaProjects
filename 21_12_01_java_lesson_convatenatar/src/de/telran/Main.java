package de.telran;

public class Main {

    public static void main(String[] args) {

        ConcatenationTester tester = new ConcatenationTester();
        IConcatenator stringConcat = new StringConcanetator();
        IConcatenator stringBuilder = new StringBuilder();
        IConcatenator stringBuffer = new StringBuffer();
        IConcatenator charArray = new CharArrayConcatenator();

        System.out.println(tester.test(stringConcat,"Hello World guys",100000));
        System.out.println(tester.test(stringBuilder,"Hello World guys",100000));
        System.out.println(tester.test(stringBuffer,"Hello World guys",100000));
        System.out.println(tester.test(charArray,"Hello World guys",100000));

    }
}
