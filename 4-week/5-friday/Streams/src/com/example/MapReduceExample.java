package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MapReduceExample {
    public static void main(String[] args){
        Stream<Integer> numbers = Stream.of(5,6);
        Optional<Integer> intOptional = numbers.reduce( (i,j) -> {
            return i * j;
        });
        if(intOptional.isPresent()){
            System.out.println("Mul " + intOptional.get());
        }

        Stream<Integer> numbers2 = Stream.of(1,2,3,4,5);
        System.out.println(numbers2.count());

        Stream<Integer> numbers3 = Stream.of(10, 188, 99 ,102, 12, -1, 121, 1);
        System.out.println(numbers3.anyMatch(num -> num ==4));

        Stream<Integer> numbers4 = Stream.of(1,2,3,4,5);
        System.out.println(numbers4.anyMatch(integer -> integer < 3));

        Stream<List<String>> nameList = Stream.of(
                Arrays.asList("John"),
                Arrays.asList("Mike"),
                Arrays.asList("Smith", "Melvin", "Joe")
        );
        Stream<String> flatStream = nameList.flatMap(strList -> strList.stream());
        System.out.println(Arrays.toString(flatStream.toArray()));
    }
}
