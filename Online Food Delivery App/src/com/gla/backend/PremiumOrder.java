package com.gla.backend;

public class PremiumOrder extends Order {

    public PremiumOrder(String orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    @Override
    public double calculateBill() {
        double discountedAmount = baseAmount - (baseAmount * 0.20);
        return discountedAmount + deliveryCharge;
    }
}
