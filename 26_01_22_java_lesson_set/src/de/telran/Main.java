package de.telran;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();
        Set<Integer> numbers2 = new HashSet<>();

        //numbers {  1, 7, -5 ,10} numbers2 {8, 10 ,7, 15 ,17}
        // the numbers budut lejati vse elementi is oboich mnojestv {1 ,7, -5 ,10 ,8 ,15, 17}
        numbers.addAll(numbers2);

        // the numbers budut lejati tolica te elementi katorie esti b numbers i katorie net b numbers2
        //{1 ,-5}
        numbers.removeAll(numbers2);

        //
        numbers.retainAll(numbers2);

        // esli tip danih dlea treeset ili treemap(kliuci) eavleaetsea comparable to obiect comparatora pri initializatia
        // atogo treeset ili treemap ne obeazatelen
        Set<Integer> numbers3 = new TreeSet<>();
        Set<String> numbers4 = new TreeSet<>();
    }
}
