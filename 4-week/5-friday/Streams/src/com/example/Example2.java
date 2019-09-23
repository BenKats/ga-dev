package com.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
        //Stream to List
        Stream<Integer> intStream = Stream.of(1,2,3,4);
        List<Integer> intList = intStream.collect(Collectors.toList());
        System.out.println(intList);

        intStream = Stream.of(1,2,3,4);
        Map<Integer, Integer> intMap = intStream.collect(Collectors.toMap(i->i, i-> i+10));
        System.out.println(intMap);
    }

}
