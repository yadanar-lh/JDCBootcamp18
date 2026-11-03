package com.jdc;

public class GenericArray {
    void main(){
        Integer[] intArray = {1,2,3,4,5};
        print(intArray);

        Double[] doubleArray = {2.3,4.5,5.6};
        print(doubleArray);
    }
    public <T> void print(T[] arr){
        for(int i = 0; i < arr.length; i++){
            T t = arr [i];
            System.out.println(t);
        }
    }
}
