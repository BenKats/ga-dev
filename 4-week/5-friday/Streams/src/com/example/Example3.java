package com.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class Example3 {
    public static void main(String[] args) {
        Stream<Integer> intStream = Stream.of(1,2,3,4);
        Integer[] ints = intStream.toArray(Integer[]::new);
        System.out.println(Arrays.toString(ints));
    }
}
