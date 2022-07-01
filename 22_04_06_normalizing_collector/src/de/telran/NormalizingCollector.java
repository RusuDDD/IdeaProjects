package de.telran;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class NormalizingCollector implements Collator<Double, List<Double>, Double> {
    @Override
    public Supplier<List<Double>> supplier() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<Double>> accumulator() {
        return;
    }

    @Override
    public Function<List<Double>,List<Double>> function() {
    return
    }
    @Override
    public Set<>

}
