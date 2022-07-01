package de.telran;

public class StringConcanetator implements IConcatenator {

    @Override
     public String concatenate(String[] strings) {
        //TODO impliments via string concatination
        String res = "";

        for (int i = 0; i < strings.length; i++) {
            //res += strings[i];
            res = res.concat(strings[i]);
        }
        return res;

    }
}
