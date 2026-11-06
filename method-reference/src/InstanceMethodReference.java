import java.util.function.Consumer;

public class InstanceMethodReference {

    public void printCustom(String text){
        System.out.println(">> " + text.toUpperCase());
    }

    static void main() {
        InstanceMethodReference ob = new InstanceMethodReference();
        Consumer<String> printConsumer = s -> ob.printCustom(s); //lambda version
        printConsumer = ob::printCustom; // method reference
        printConsumer.accept("Life is beautiful!");

        Consumer<String> consoleLogger = s -> System.out.println(s);
        consoleLogger = System.out::println;
        consoleLogger.accept("Life Live With Passion!");
    }
}
