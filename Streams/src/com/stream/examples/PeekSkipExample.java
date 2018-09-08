package com.stream.examples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PeekSkipExample {

    public static void main(String[] args) {
        IntStream.of(1,2,3,4,5,6,7,8,9)
                .skip(3)//Skip first 3 values
                .filter(val -> val>1)
                .forEach(val -> System.out.println(val));

        List<String> collect = Stream.of("Hi", "Hello", "Welcome", "How r u", "Good", "Nice")
                .filter(val -> !val.equalsIgnoreCase("Hello"))
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

}

