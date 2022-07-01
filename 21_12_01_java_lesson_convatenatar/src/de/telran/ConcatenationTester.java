package de.telran;

import java.util.Arrays;

public class ConcatenationTester {
    /**
     * The method test the performance of concatination using "concatenator", adding the "String " "number" times to itself
     *
     * @param concatenator - the way (implimentation ) to us the performance with this
     * @param string       to concatenate
     * @param number       times to concatenate
     * @return the time taken for the concatination with "concatenator"
     */

    public long test(IConcatenator concatenator, String string, int number) {
        String[] strings = composeStrings(string, number);

        long currentTimeMillis = System.currentTimeMillis();
        concatenator.concatenate(strings);
        return System.currentTimeMillis() - currentTimeMillis;

        //TODO measure the time taken for using concatenator.concatenate()

    }

    //TODO impliment the methd . It must compose a String array from the string number times
    private String[] composeStrings(String string, int number) {
        String[] strings = new String[number];
        Arrays.fill(strings, string);
        return strings;
    }
}
