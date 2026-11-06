import java.util.function.Function;

public class StaticMethodReference {
    static void main() {
        Function<Double,Double> squareCal = n -> StaticMethodReference.calculateSquare(n);
        //                                         lambda
        squareCal = StaticMethodReference::calculateSquare; // method reference
        System.out.println("Square : " + squareCal.apply(8.0));

        Function<String, Integer> parser = s-> Integer.parseInt(s); //lambda
        parser = Integer::parseInt; //method reference
        System.out.println("Parse Number : " + parser.apply("500"));
    }
    public static Double calculateSquare(Double num){
        return num * num;
    }


}
