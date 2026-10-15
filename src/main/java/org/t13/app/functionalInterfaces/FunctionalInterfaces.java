package org.t13.app.functionalInterfaces;

import java.util.function.*;

public class FunctionalInterfaces {

    static void main() {

        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello, World!");

        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        Function<Integer, String> intToString = Object::toString;
        System.out.println("String representation of 123: " + intToString.apply(123));

        Supplier<String> supplier = () -> "Hello, Supplier!";
        System.out.println("Supplier output: " + supplier.get());

        BiConsumer<String, Integer> biConsumer = (s, i) -> System.out.println("String: " + s + ", Integer: " + i);
        biConsumer.accept("Hello", 42);

        BiPredicate<String, String> biPredicate = (s1, s2) -> s1.equals(s2);
        System.out.println("Are 'test' and 'test' equal? " + biPredicate.test("test", "test"));

        BiFunction<Integer, Integer, String> biFunction = (a, b) -> "Sum: " + (a + b);
        System.out.println(biFunction.apply(5, 10));

        BooleanSupplier booleanSupplier = () -> true;
        System.out.println("BooleanSupplier output: " + booleanSupplier.getAsBoolean());
    }
}
