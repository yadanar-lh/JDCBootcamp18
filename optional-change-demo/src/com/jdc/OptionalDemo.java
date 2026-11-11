package com.jdc;

import java.util.Locale;
import java.util.Optional;

public class OptionalDemo {
    static void main() {

        String name = "Yadanar";
//        Optional<String> nameOptional = Optional.ofNullable(name);
//        using ofNullable method instead of the following line
        Optional<String> nameOptional = name == null ? Optional.empty(): Optional.of(name);
        nameOptional.ifPresent(n -> System.out.println(n.toUpperCase()));
        Optional<Double> avgOptional = avg(100,90);
        System.out.println(avgOptional);
        if(avgOptional.isPresent()){
            System.out.println("Avg is " + avgOptional.get());
        }

        avgOptional.ifPresent(System.out::println);
        avgOptional.ifPresentOrElse(System.out::println, ()->{
            System.out.println("No Average!");
        });

        System.out.println("OrElseGet: " + avgOptional.orElseGet(()->Double.NaN));
        System.out.println("OrElse: " + avgOptional.orElse(Double.NaN));
        System.out.println("Or: " + avgOptional.or(()->Optional.empty()));
        System.out.println("OrElseThrow: " + avgOptional.orElseThrow(RuntimeException::new));

        isThreeDigits(10);
        isThreeDigits(100);
    }
    public static Optional<Double> avg(double...marks){
        if(marks.length < 2){
            return Optional.empty();
        }

        double sum = 0;
        for(double mark:marks){
            sum += mark;
        }

        return Optional.of(sum/(double)marks.length);
    }

    public static void isThreeDigits(int num){
        Optional.of(num)
                .filter(n -> String.valueOf(n).length() == 3)
                .ifPresentOrElse(n -> {
                    System.out.println("Three Digits : " + n);
                }, () -> {
                    System.out.println(num + " is not three digits!");
                });
    }

}
