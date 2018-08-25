package LambdaExample;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(new Person("Ganesh", "Dhandapani", 28),
                new Person("Dhivya", "Lakshmi", 25),
                new Person("Srikanth", "Santhinathan", 27),
                new Person("MiruthulaSri", "Manivannan", 26),
                new Person("Sarmili", "Manikarajan", 26));

        //External Loop iteration, looping of the list by index is decided by user
        System.out.println("For loop");
        for (int i =0; i<personList.size(); i++) {
            System.out.println(personList.get(i));
        }

        //External Loop iteration, looping of the list is decided by user
        System.out.println("For-in loop");
        for (Person p: personList) {
            System.out.println(p);
        }

        //Internal loop iteration, list iteration is decided by compiler.
        //This is useful while parallel execution, since processor is independent to decide the looping
        System.out.println("For-each loop");
        //personList.forEach(p-> System.out.println(p));
        personList.forEach(System.out::println);

    }
}
