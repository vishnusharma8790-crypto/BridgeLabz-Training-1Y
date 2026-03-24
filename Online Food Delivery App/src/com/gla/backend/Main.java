package com.gla.backend;

public class Main {
    public static void main(String[] args) {

        Order order1 = new RegularOrder("ORD101", 500);
        Order order2 = new PremiumOrder("ORD102", 500);

        System.out.println("Regular Order Bill: " + order1.calculateBill());
        System.out.println("Premium Order Bill: " + order2.calculateBill());
    }
}
