package functional.interfaces;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemo {
    static void main() {
        Supplier<LocalDateTime> newSupplier = () -> LocalDateTime.now();
        System.out.println("Current Time: " + newSupplier.get());

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random Value: " + randomValue.get());
    }
}
