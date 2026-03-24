package com.gla.backend;

public abstract class Order {
    protected String orderId;
    protected double baseAmount;
    protected static double deliveryCharge = 40.0;

    public Order(String orderId, double baseAmount) {
        this.orderId = orderId;
        this.baseAmount = baseAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public abstract double calculateBill();
}
