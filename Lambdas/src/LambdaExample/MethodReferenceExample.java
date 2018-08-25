package LambdaExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample {

    public static void main(String[] args) {

        Thread thread = new Thread(MethodReferenceExample::process);
        thread.start();

        List<Person> personList = Arrays.asList(new Person("Ganesh", "Dhandapani", 28),
                new Person("Dhivya", "Lakshmi", 25),
                new Person("Srikanth", "Santhinathan", 27),
                new Person("MiruthulaSri", "Manivannan", 26),
                new Person("Sarmili", "Manikarajan", 26));

        printByCondition(personList, p -> p.getFirstName().startsWith("G"), System.out::println);
        //Method reference can be used if the input of lambda and  output is same

    }

    public static void process() {
        System.out.println("Method Reference example");
    }

    private static void printByCondition(List<Person> personList, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : personList) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}
