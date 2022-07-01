package de.telran;

import java.lang.ref.SoftReference;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String string3 = new String("Hello World!");
        String stringFromChars = new String(new char[]{'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'});
        String string = "hello World!";
        String string2 = "Hello World!";

        System.out.println("hello World!");

        System.out.println(string == string2);//true
        System.out.println(string == string3);//false
        System.out.println(string == stringFromChars);//false
        System.out.println(string3 == stringFromChars);//false

        System.out.println(string.equals(string2));//true
        System.out.println(string.equals(string3));//true
        System.out.println(string.equals(stringFromChars));//true
        System.out.println(string3.equals(stringFromChars));//true

        //char
        char a = 'a';
        System.out.println(a);//'a'
        System.out.println(a + 0);//97
        System.out.println(string + a);//hello world a
        System.out.println(string + a + 0);//hello world a 0

        //charAt()->char
        System.out.println(string.charAt(2));//'l'

        //concat -> str
        System.out.println(string.concat(string2));//hello world!Hello world!
        System.out.println(string + string2);//hello world!Hello world!

        //contains() -> boolean
        System.out.println(string.contains("llo"));//true
        System.out.println(string.contains("llom"));//false

        //startsWith(), endsWith() -> boolean
        System.out.println(string.startsWith("Hell"));//false

        //equalsIgnoreCase() -> boolea
        String hello1 = "HeLlo";
        String hello2 = "hello";
        System.out.println(hello1.equalsIgnoreCase(hello2));//true

        //indexOf() -> int returns first  index of the pattern in the string

        System.out.println(string.indexOf("l", 4));//9
        System.out.println(string.indexOf("lo"));//3
        System.out.println(string.indexOf("llo"));//2

        //lastIndexOf() -> int - return the last index of the pattern

        System.out.println(string.lastIndexOf("l"));//9
        System.out.println(string.lastIndexOf("l", 8));//3

        //length() -> int
        System.out.println(string.length());//12

        // split() -> String[]
        String[] fromString = string.split("l");
        System.out.println(Arrays.toString(fromString));
        System.out.println(Arrays.toString(string.split(" ")));

        //tocharArray() -> char[]
        char[] chars = string.toCharArray();//{'h', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'})
        System.out.println(Arrays.toString(chars));

        //tolowerCase() , toUpperCase() -> String
        String upperString = string.toUpperCase();
        System.out.println(string);
        System.out.println(upperString);//HELLO WORLD

        //substring() -> String , the second argument wich is the index of the end, applies exclusive
        String subString1 = string.substring(2);//llo world
        String subString2 = string.substring(2, 8);//llo wor
        System.out.println(subString1);
        System.out.println(subString2);

        //reverse()
        System.out.println(reverse(string));
        System.out.println(reverse2(string));
    }

    //good
    static String reverse(String str) {
        char[] chars = new char[str.length()];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = str.charAt(chars.length - 1 - i);
        }
        return new String(chars);
    }

    //bad very slow variant
    static String reverse2(String str) {
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            res += str.charAt(str.length() - 1 - i);
        }
        return res;
    }
}
