package homework.issue_1_Exception;

import java.util.ArrayList;
import java.util.List;

public class ConverterInteger {
    private List<String> stringList;

    public ConverterInteger(List<String> stringList) {
        this.stringList = stringList;
    }

    public List<String> getStringList() {
        return stringList;
    }

    @Override
    public String toString() {
        return "ConverterInteger{" +
                "stringList=" + stringList +
                '}';
    }

    public void convertTheStringToTheInteger(List<String> strings) {

        List<Integer> integers = new ArrayList<>();
        List<Object> objectsErrors = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            try {
                integers.add(Integer.parseInt(strings.get(i)));
            } catch (Exception e) {
                System.out.println("Element " + strings.get(i) + " index " + i);
            }
        }
        System.out.println(integers);
    }
}

