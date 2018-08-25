package LambdaExampleTest;

import LambdaExample.LambdaExample;
import LambdaExample.Person;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LambdaExampleTest {

    private static List<Person> personList;

    @BeforeAll
    public static void init() {
        personList = Arrays.asList(new Person("Ganesh", "Dhandapani", 28),
                new Person("Dhivya", "Lakshmi", 25),
                new Person("Srikanth", "Santhinathan", 27),
                new Person("MiruthulaSri", "Manivannan", 26),
                new Person("Sarmili", "Manikarajan", 26));
    }

    @Test
    void simpleLambdaExample() {
        LambdaExample.simpleLambdaExample(personList);
    }
}