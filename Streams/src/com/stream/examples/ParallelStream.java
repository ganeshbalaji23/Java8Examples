package com.stream.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStream {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList();
        for(int i = 0; i<10 ; i++) {
            list.add(i);
        }

       // list.stream().forEach(System.out::println);
        list.parallelStream().forEach(val -> System.out.println(val));
        System.out.println("*********************************");
        List<Integer> collect = list.parallelStream().collect(Collectors.toList());

        collect.stream().forEach(val -> System.out.println(val));

    }

}
