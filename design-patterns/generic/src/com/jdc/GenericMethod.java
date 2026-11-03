package com.jdc;

public class GenericMethod {
     void main() {
        Integer[] intArray = {1,2,3,4,5};
        Integer num = getElement(intArray,1);
        System.out.println("Num: " + num);

        String[] stringArray = {"Hello!","Coders","Countryman"};
        String s = getElement(stringArray, 2);
         System.out.println("Name: " + s);
    }
    public <T> T getElement(T[] arr, int index){
        if(index <= arr.length-1){
            return arr[index];
        }
        return null;
    }

}
