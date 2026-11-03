package com.jdc;

public class GenericContainedMethod {
    public <T> boolean isContained(T[] arr, T element){
        for(T t : arr){
            if (t.equals(element)) {
                return true;
            }
        }
        return false;
    }

    void main(){
        Integer[] intArray = {2,3,4,5};
        System.out.println("7 is contained in intArray? : " + isContained(intArray,7));
    }

}
