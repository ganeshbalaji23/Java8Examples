package com.stream.examples;

import LambdaExample.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Ganesh", "Dhandapani", 28, Arrays.asList("1", "2")),
                new Person("Dhivya", "Lakshmi", 25, Arrays.asList("3", "4", "5")),
                new Person("Srikanth", "Santhinathan", 27, Arrays.asList("5", "6")),
                new Person("MiruthulaSri", "Manivannan", 26, Arrays.asList("7")),
                new Person("Sarmili", "Manikarajan", 26, Arrays.asList("8")));


        Optional<String> filteredNo = personList.stream()
                .map(person -> person.getPhoneNumbers().stream())
                .flatMap(phoneStream -> phoneStream.filter(phoneNo -> phoneNo.equals("5")))
                .findAny();

        filteredNo.ifPresent(System.out::println);

    }
}
