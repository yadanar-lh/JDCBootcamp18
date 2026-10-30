package com.jdc;

import java.util.Scanner;

public class ThrowException {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive even number : ");
        try{
            int num = sc.nextInt();
            if(num > 0 && num % 2 == 0){
                System.out.println("Positive Even Number!" + num);
            } else {
                throw new PositiveEvenNumberException(num + " is not a positive even number.");
            }
        } catch(RuntimeException e){
            e.printStackTrace();
        }
    }
}
