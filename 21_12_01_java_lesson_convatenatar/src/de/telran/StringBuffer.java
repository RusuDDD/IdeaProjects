package de.telran;

public class StringBuffer implements IConcatenator{

    @Override
    public String stringBuffer(String[] strings) {
        StringBuffer sbuf= new StringBuffer();
        for (int i = 0; i < strings.length; i++) {
            sbuf.append(strings[i]);
        }
        return sbuf.toString();
    }
}
