package de.telran;

public class StringBuilder implements IConcatenator{

    @Override
    public String stringBuilder(String[] strings) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            sb.(strings[i]);
        }

        return sb.toString();
    }
}
