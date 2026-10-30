package com.jdc;
//if Exception is extended, it becomes checked exception
public class PositiveEvenNumberException extends RuntimeException{
    public PositiveEvenNumberException(String messaage){
        super(messaage);
    }
}
