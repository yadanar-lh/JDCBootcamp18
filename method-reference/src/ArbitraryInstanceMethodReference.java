import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class ArbitraryInstanceMethodReference {
    public String greet(String name){
        return "Hello " + name + ".";
    }

    static void main() {
        BiFunction<ArbitraryInstanceMethodReference, String, String>
                sayHello = (a,b) -> a.greet(b); //lambda

        sayHello = ArbitraryInstanceMethodReference::greet;
        System.out.println(sayHello.apply(new ArbitraryInstanceMethodReference(),"John"));

        Function<String, Integer> lengthFunction = s -> s.length();
        lengthFunction = String::length;
        System.out.println("Length: " + lengthFunction.apply("Happy Coding"));

        BiPredicate<String, String> equalsChecker = (s1,s2) -> s1.equalsIgnoreCase(s2);
        equalsChecker = String::equalsIgnoreCase;
        System.out.println("Java and java is same? " + equalsChecker.test("Java", "java"));
    }


}
