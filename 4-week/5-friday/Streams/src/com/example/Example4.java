package com.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example4 {
    public static void main(String[] args) {
        Stream<String> names2 = Stream.of("f", "d", "e", "z");
        List<String> reverseSorted = names2.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSorted);

        //Dont reuse the same stream name, a stream should have a specififed function
        names2 = Stream.of("f", "d", "e", "z");
        List<String> natural = names2.sorted().collect(Collectors.toList());
        System.out.println(natural);

    }
}
