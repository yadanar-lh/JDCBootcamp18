package com.jdc;

public class MyOwnAutoShop {
    static void main() {
        Car sedan1 = new Sedan(120, 25000.0, "Black", 20);
        Car sedan2 = new Sedan(100, 20000.0, "White", 30);

        Car ford1 = new Ford(140, 30000.0, "Blue", 2024, 2000);
        Car ford2 = new Ford(110, 18000.0, "Red", 2021, 1500);

        Car truck1 = new Truck(80, 40000.0, "White", 3500);
        Car truck2 = new Truck(60, 30000.0, "Black", 2000);

        Car car = new Car(90, 15000.0, "Silver");

        double sedan1Price = sedan1.getSalePrice();
        double sedan2Price = sedan2.getSalePrice();
        double ford1Price = ford1.getSalePrice();
        double ford2Price = ford2.getSalePrice();
        double truck1Price = truck1.getSalePrice();
        double truck2Price = truck2.getSalePrice();
        double carPrice = car.getSalePrice();

        System.out.println("Sedan 1 Sale Price : $" + sedan1Price);
        System.out.println("Sedan 2 Sale Price : $" + sedan2Price);
        System.out.println("Ford 1 Sale Price : $" + ford1Price);
        System.out.println("Ford 2 Sale Price : $" + ford2Price);
        System.out.println("Truck 1 Sale Price : $" + truck1Price);
        System.out.println("Truck 2 Sale Price : $" + truck2Price);
        System.out.println("Car Sale Price : $" +carPrice);
    }
}
