package functional.interfaces;

import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerDemo {
    static void main() {
        Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());
        printUpper.accept("docker container");

        Consumer<String> printLength = s -> System.out.println("Length: " + s.length());
        Consumer<String> combined = printUpper.andThen(printLength);
        combined.accept("Kubernetes");
    }
}
