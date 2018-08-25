package LambdaExample;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ExceptionHandlingLambda {

    public static void main(String[] args) {

        int intArray[] = {2,4,6,8,10};
        int key = 0;

        process(intArray, key, wrapperLambda((value, keyVal)-> System.out.println(value+keyVal)));
        process(intArray, key, wrapperLambda((value, keyVal)-> System.out.println(value/keyVal)));
    }

    private static void process(int[] intArray, int key, BiConsumer<Integer, Integer> consumer) {

        for (int value:intArray) {
            consumer.accept(value, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (v, k) -> {
            try {
                consumer.accept(v, k);
            } catch (ArithmeticException e) {
                System.out.println("Exception in Arithmetic operation");
            }
        };

    }
}
