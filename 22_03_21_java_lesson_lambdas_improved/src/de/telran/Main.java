package de.telran;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
	// Metho reference(silka na method) - ato realizatia functionalinava interfeisa ,
        // ispolizuia functionalinasti suschestvuiuscheva methoda .

        Function<Double, Double> sqrt = Math::sqrt;

        Function<Double,Double> sqrt2=sqrt::apply;

        Supplier<String> generator = String::new;

        Function<String,String>identity=String::new;

     }
}
