package com.jdc;

import java.util.Scanner;

public class MultiCatch {

    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        try {
            int num = sc.nextInt();
            int result = 6 / num;
            int[] nums = new int[num];
            nums[5] = 11;
            Integer.parseInt("a");
            //java 7 project coin but have to be no relationship

            //can catch with parent exception as follows:
            //catch(Exception e){
                //if(e instance of Arithmetic Exception error){
                //print (error);
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("Hello World!");
    }

}
