import LambdaExample.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterForEachExample {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Ganesh", "Dhandapani", 28),
                new Person("Dhivya", "Lakshmi", 25),
                new Person("Srikanth", "Santhinathan", 27),
                new Person("MiruthulaSri", "Manivannan", 26),
                new Person("Sarmili", "Manikarajan", 26));

        personList.stream().filter(FilterForEachExample::getFirstLetter).forEach(System.out::println);
    }

    private static boolean getFirstLetter(Person name) {
        return name .getFirstName().startsWith("S");
    }
}
