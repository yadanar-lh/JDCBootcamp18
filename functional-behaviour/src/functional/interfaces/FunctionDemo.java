package functional.interfaces;

import java.util.function.Function;

public class FunctionDemo {
    static void main() {
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println(stringLength.apply("Microservices"));

        Function<Integer, Integer> multiplyByTwo = n -> n * 2;
        Function<Integer, Integer> addTen = n -> n + 10;
        Function<Integer, Integer> pipeLine = multiplyByTwo.andThen(addTen);

        System.out.println(pipeLine.apply(5));
    }
}
