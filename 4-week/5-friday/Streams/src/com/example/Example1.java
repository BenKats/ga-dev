package com.example;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Hello", "World");
        //creates Stream
        Stream<Integer> integerStream = Stream.of(1,2,3,4);

        //converts strList to stream
        Stream strStream = strList.stream();

        strStream.forEach(value -> System.out.println(value));
        integerStream.forEach(value -> System.out.println(value));
    }
}
