package de.telran;

public interface IConcatenator {

    //TODO Impliment this interface 4 ways:
    // 1. with String
    // 2. with StringBuilder
    // 3. with StringBuffer
    // 4. using char array whose length is the total length of all the strings in the string array.
    // The implimentation schould create a char array of the total length, then one by one coppy  every string into this array.
    // After that creat a result string based on this array.


    /**
     * The method concatenates all the elements from "Strings"
     * @param strings a String array to concatenate
     * @return concatenated string
     */

    String concatenate(String[] strings);

}
