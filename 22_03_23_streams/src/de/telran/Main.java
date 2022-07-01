package de.telran;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //stream ato- instrument dlea abrabotki posledovatelinosti danihv bollee functionalinim stile
        // stream ne evleaetsea colectii , on rabotaet s elementami is istocinika
        // stream<T> , Intstream, LongStream, DoubleStream
        //1. Sozdanie streamov.
        // colection.stream()
        // -Stream<Double> stream = Arrays.stream(new Double[]{100d,23d});
        // - IntStream stream = str.chars();
        // - LongStream  stream = LongStream.of(100 ,244 , 5);
        // - Stream<Long>  longstream = Stream.of(100 ,244 , 5);
        // - Stream<Integer> stream = Stream.concat(stream1,stream2);
        // - Stream.generate(supplier), Stream.generate(Math.random);
        //  - IntStream intStream = IntStream.iterate(1, x -> 3 * x -10);
        // IntStream.range(0, 10); stream s istocinikam sostaeaschii is int cisel ot 0 do 9 vkliucitelino
        // IntStream.rangeClosed(0, 10); stream s istocinikam sostaeaschii is int cisel ot 0 do 10 vkliucitelino
        LongStream stream = LongStream.of(100, 244, 5);
        Stream<Long> longStream = Stream.of(100l, 34l, 5l);

        // 2. Vidi operatii (methodov) streama
        // - Intermediate (promejutacinie)
        // - Terminal (Terminalinie)

        // a) Promejutocinie operatii - operatii katorie vozvrosheaet novii stream , dobavleaet k posledovatelinosti
        // ego operatii esheo odnu , ne zapuskaet viceslenie.
        // - filter() - otbrasivaet te danie , predicate .test() ot katorii dast false
        // - map(function) - vozvrosheaet novii stream , polucenii is starova puteom priminenie function.apply() k
        // ego elemantam
        // limit(N) - vozvrosheaet novii stream sosstoeashii is pervih N elementov is starova streama
        // skip(N) - vozvrosheaet novii stream sosstoeashii is starova streama, sleduiushii posle pervih N elementov
        // - distinct () - vozvrosheaet novii stream bez povtorenii  elementov is pervova streama
        // - sorted() - vozvrosheaet stream s otsortirovanimi elementami starova streama . esli elementi Comparable
        // mojno ispolizavati bez Comparator

        // flatMap(Function<T , Stram<E>>)

        Stream<List<Integer>> listStream = Stream.of(
                Arrays.asList(1, 5, 8),
                Arrays.asList(-5, 7),
                Arrays.asList(10, 50, -8)
        );

        Function<List<Integer>, Stream<Integer>> unwrap = (list) -> list.stream();
        System.out.println(listStream.flatMap(unwrap).collect(Collectors.toList()));

        // b).Terminalinie operatii  - operatii katorii zapuskaet posledovatelinosti promejutocinix operatii i vozvrosheaet rezultat
        // -  collect(collector)
        // toArray() - prevrashaet streamv masiv
        // max/min  - nahodit maximum /minimul (dlea obsheva streama nujen comparator)
        // count()  - vozvrosheat kolicestvo elementovv streame
        // - forEach(consummer) - prohodit pro vsem elementov is streama i prinimaet kajdomu consumer .accept(t)
        stream.forEach(System.out::println);
        // - reduce() - combiniruet elementi is streama
        // System.out.println(longStream.reduce((Long x, Long y) -> x + y));
        System.out.println(longStream.reduce(10L,(Long x, Long y) -> x + y));
    // anyMuch(predicate) , allMach(Predicate), noneMach(predicate) - vozvrosheaet da ili net
        // primer:
        // esti coleactia strok, hotim sostaviti straku sostoeashiuu is vseh slov 4 bukv v uppercase,
        // kajdoe slova streceaetsea odin raz
        List<String> words = Arrays.asList("Hello ", "world", "and", "Vasya", "in", "the ", "world");
        String res = words.stream()
                .filter(words -> words.length() < 5)
                .map(String::toUpperCase)
                .distinct()
                .reduce("", (accumulated, currentelement) -> accumulated + currentelement);
        System.out.println(res);

    }
}
