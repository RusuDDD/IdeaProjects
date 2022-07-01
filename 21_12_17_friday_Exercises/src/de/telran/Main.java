package de.telran;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


/*
        1. Есть два класса  : Address  с полями улица и номер дома и Person   с полями
        name and address.  написать метод  List<Address> getAddresses(List<Person> persons)
        то есть по списку persons  возвращать список их адресов

        2. Есть список с именами: Ivan, Maria, Stephan, John, Amalia.  написать функцию, которая вернет список не
        содержащий имена исходного списка длиной 4

        3. Есть два списка одинаковой длины с числами. Написать метод, возвращающий список с элементами Yes  или No
        где значение на i-том месте зависит от того, равны ли элементы двух списков под номером i
        (1,2,3,4) and (5,2,3,3)->(No, Yes, Yes, No)

        4. Обьединить два листа в один

        5.есть лист  целых чисел. написать метод, возвращающий лист без элементов больше заданного

        6. Есть лист стрингов. Написать метод, возвращающий  самую короткую или самую длинную строку
        в зависимости от того, какая встречается в листе раньше. Если несколько строк самые короткие или длинные,
        то учитывается первая встречающаяся
 */

    }

    public List<Address> gettAddress(List<Person> person) {
        List<Address> returnAddress = new ArrayList<>();
        for (Person p: person) returnAddress.add(p.getAddress());


        return returnAddress;
    }

    public List<String> listWithoutNamesLengthFour(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            if (s.length() != 4) {
                result.add(s);
            }
            return result;
        }
    }


    }
