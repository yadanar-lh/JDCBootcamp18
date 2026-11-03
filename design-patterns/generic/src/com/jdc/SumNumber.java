package com.jdc;

public class SumNumber {
    public double sum(int[] arr){
        double total = 0;
        for(int n : arr){
            total += n;
        }
        return total;
    }

    public double sum(float[] arr){
        double total = 0;
        for(float f : arr){
            total += f;
        }
        return total;
    }

    public double sum(double[] arr){
        double total = 0;
        for(double d : arr){
            total += d;
        }
        return total;
    }

    public double sum(Object[] arr){
        double total = 0;
        for(Object o : arr){
//            total += o; not working
        }
        return total;
    }

    void main(){
        int[] intArray = {1,2,3,4,5};
        System.out.println("Sum : " + sum(intArray));

        float[] floatArray = {1.2f, 1.3f,1.4f};
        System.out.println("Sum : " + sum(floatArray));

        double[] doubleArray = {2.3,3.4,5.6};
        System.out.println("Sum : " + sum(doubleArray));
    }
}
