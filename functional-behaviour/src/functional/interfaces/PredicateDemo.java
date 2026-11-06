package functional.interfaces;

import java.util.function.Predicate;

public class PredicateDemo {
    static void main() {
        Predicate<String> isLongTest = str -> str.length() > 5;
        System.out.println(isLongTest.test("Java"));
        System.out.println(isLongTest.test("Spring Boot"));

        Predicate<Integer> isPositive = n ->  n > 0;
        Predicate<Integer> isEven = n -> n % 2 == 0;

        Predicate<Integer> isPositiveEven = isPositive.and(isEven);
        System.out.println(isPositiveEven.test(8));
        System.out.println(isPositiveEven.test(-4));
    }
}
