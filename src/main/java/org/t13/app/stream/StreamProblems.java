package org.t13.app.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamProblems {
    static void main() {
        String[] names = {"adam" , "jhon", "doe" , "adam"};
        Arrays.stream(names).sequential().forEach(System.out::println);
        System.out.println("------------");
        Map<String, Long> result1 = Arrays.stream(names).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result1);
        System.out.println("------------");
        Map<Character, Long> result2 = Arrays.stream(names).map(x -> x.charAt(0)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result2);
        System.out.println("------------");
        String[] result3 = Arrays.stream(names).flatMap(x -> Arrays.stream(x.split(""))).toArray(String[]::new);
        System.out.println(Arrays.toString(result3));
        System.out.println("------------");
        Arrays.stream(result3).distinct().forEach(System.out::println);
        System.out.println("------------");
        Arrays.stream(result3).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).values().forEach(System.out::println);
        System.out.println("------------");
        Arrays.stream(result3)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .filter(x -> x>1).forEach(System.out::println);
        System.out.println("------------");
        Arrays.stream(result3)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((x,y) -> {
                    if (y > 1) {
                        System.out.println(x + " - " + y);
                    } else {
                        System.out.println("not repeating");
                    }
                });
        System.out.println("------------");
        Arrays.stream(result3)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .findFirst()
                .ifPresent(x -> System.out.println(x.getKey() + " is the first repeating character, that repeats " + x.getValue() + " times"));
        System.out.println("------------");

    }
}
