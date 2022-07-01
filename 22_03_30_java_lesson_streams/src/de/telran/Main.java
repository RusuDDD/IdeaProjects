package de.telran;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public class Solution {
        public <T> Optional<Predicate<T>> union(List<Predicate<T>> predicates) {
            Optional<Predicate<T>> optionalTPredicate = predicates.stream()
                    .reduce(Predicate::or);

            Predicate<T> byDefolt = (T t) -> false;

            Supplier<Predicate<T>> supplierbyDefolt = () -> byDefolt;

            return optionalTPredicate.orElseGet(supplierbyDefolt);

        }

        public <T> Predicate<T> interset(List<Predicate<T>> predicates) {
            ret\predicates.stream()
                    .reduce(Predicate::and)
                    .orElseThrow(NoSuchElementException::new);
        }

    }

}

