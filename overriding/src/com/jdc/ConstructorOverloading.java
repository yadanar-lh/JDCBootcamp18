package com.jdc;

public class ConstructorOverloading {
    public ConstructorOverloading(){}

    public ConstructorOverloading(String name){

    }

    public ConstructorOverloading(String name, String email){
        this(name);
    }

    public ConstructorOverloading(String name, String email, String phone){
        this(name,email);
    }

    public ConstructorOverloading(String name, String email, String phone, String address){
        this(name,email,phone);
    }

    static void main() {
        ConstructorOverloading obj = new ConstructorOverloading("Yadanar", "era@mail.com");
    }

}
