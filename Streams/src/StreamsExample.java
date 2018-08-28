import LambdaExample.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample {

    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(new Person("Ganesh", "Dhandapani", 28),
                new Person("Dhivya", "Lakshmi", 25),
                new Person("Srikanth", "Santhinathan", 27),
                new Person("MiruthulaSri", "Manivannan", 26),
                new Person("Sarmili", "Manikarajan", 26));

        Stream<Person> personStream = personList.stream();
        //personStream.filter(p->p.getLastName().startsWith("M")).forEach(System.out::println);

        long count = personStream.filter(p->p.getFirstName().startsWith("S")).count();
        System.out.println(count);

    }
}
