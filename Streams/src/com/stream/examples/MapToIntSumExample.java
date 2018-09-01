package com.stream.examples;

import LambdaExample.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapToIntSumExample {

    public static void main(String[] args) {

        List<String> userList = Arrays.asList("Ganesh", "Dhivya","Srikanth","Miruthula","Sarmili");

        /*List<Person> personList = Arrays.asList(new Person("Ganesh", "Dhandapani", 28),
                new Person("Dhivya", "Lakshmi", 25),
                new Person("Srikanth", "Santhinathan", 27),
                new Person("MiruthulaSri", "Manivannan", 26),
                new Person("Sarmili", "Manikarajan", 26));*/

        //Mapping data from userList to create new Person object
        userList.stream().map(Person::new).forEach(System.out::println);
        ////Mapping data from userList to create new Person object and collect it to form a list
        List<Person> personList = userList.stream().map(Person::new).collect(Collectors.toList());
        System.out.println(personList.size());

        int sum = personList.stream().mapToInt(Person::getAge).sum();
        System.out.println(sum);
    }
}
