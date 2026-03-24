package com.gla.backend;

import java.util.ArrayList;
import java.util.List;

public class BillingDemo {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new RegularOrder("R101", 500.0));
        orders.add(new PremiumOrder("P201", 500.0));

        for (Order order : orders) {
            System.out.println("Order ID: " + order.getOrderId()
                    + ", Final Bill: " + order.calculateBill());
        }
    }
}
