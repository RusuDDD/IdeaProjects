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

    public  List<Integer> convertTheStringToTheInteger(List<String> strings) {

        List<Integer> integers = new ArrayList<>();

        List<Object> objectsErrors = new ArrayList<>();
        for (String o : strings) {
            try {
                integers.add(Integer.parseInt(o));
            } catch (Exception e) {
                objectsErrors.add(o);
            }
        }
        System.out.println(objectsErrors);

        return integers;
    }
}
