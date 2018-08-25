package LambdaExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExample {

    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(new Person("Ganesh", "Dhandapani", 28),
                new Person("Dhivya", "Lakshmi", 25),
                new Person("Srikanth", "Santhinathan", 27),
                new Person("MiruthulaSri", "Manivannan", 26),
                new Person("Sarmili", "Manikarajan", 26));

        simpleLambdaExample(personList);

    }

    public static void simpleLambdaExample(List<Person> personList) {

        //Sort by Last Name
        Collections.sort(personList, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
        //Get All person
        printByCondition(personList, p ->true, p -> System.out.println(p));
        //Get Person by Last name starting with M
        printByCondition(personList, p -> p.getLastName().startsWith("M"), p -> System.out.println(p));
        //Get Person by First name starting with G
        printByCondition(personList, p -> p.getFirstName().startsWith("G"), p -> System.out.println(p));

    }

    private static void printByCondition(List<Person> personList, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : personList) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}
