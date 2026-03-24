package com.gla.backend;

public class RegularOrder extends Order {

    public RegularOrder(String orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    @Override
    public double calculateBill() {
        return baseAmount + deliveryCharge;
    }
}
