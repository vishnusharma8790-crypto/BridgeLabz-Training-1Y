package com.gla.multithreading.fooddelivery;

import java.util.ArrayList;
import java.util.List;

public class FoodDeliveryMain {

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(101, "Spice Hub", 6, "Express"));
        orders.add(new Order(102, "Green Bowl", 8, "Standard"));
        orders.add(new Order(103, "City Bites", 10, "Economy"));
        orders.add(new Order(104, "Royal Kitchen", 7, "Express"));

        List<Thread> deliveryThreads = new ArrayList<>();
        int agentCounter = 1;

        for (Order order : orders) {
            Thread thread = new Thread(new DeliveryTask(order), "Delivery-Agent-" + agentCounter++);
            thread.setPriority(getPriorityByOrderType(order.getType()));
            deliveryThreads.add(thread);
        }

        for (Thread thread : deliveryThreads) {
            thread.start();
        }

        for (Thread thread : deliveryThreads) {
            try {
                thread.join();
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                System.out.println("Food delivery simulation interrupted.");
                return;
            }
        }

        System.out.println("All food deliveries completed.");
    }

    private static int getPriorityByOrderType(String type) {
        if ("Express".equalsIgnoreCase(type)) {
            return 10;
        }
        if ("Standard".equalsIgnoreCase(type)) {
            return 5;
        }
        return 3;
    }
}
