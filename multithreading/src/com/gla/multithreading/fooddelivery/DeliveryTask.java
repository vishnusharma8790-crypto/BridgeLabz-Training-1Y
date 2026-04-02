package com.gla.multithreading.fooddelivery;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DeliveryTask implements Runnable {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");
    private final Order order;

    public DeliveryTask(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        long startMillis = System.currentTimeMillis();

        System.out.printf("[%s] Agent: %s | Priority: %d | Order %d (%s, %s): Picked up%n",
                LocalTime.now().format(FORMATTER),
                Thread.currentThread().getName(),
                Thread.currentThread().getPriority(),
                order.getId(),
                order.getRestaurant(),
                order.getType());

        long totalMillis = order.getDeliveryTimeInSeconds() * 1000L;
        long firstLeg = totalMillis / 2;
        long secondLeg = totalMillis - firstLeg;

        try {
            Thread.sleep(firstLeg);
            System.out.printf("[%s] Agent: %s | Priority: %d | Order %d: In Transit%n",
                    LocalTime.now().format(FORMATTER),
                    Thread.currentThread().getName(),
                    Thread.currentThread().getPriority(),
                    order.getId());

            Thread.sleep(secondLeg);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            System.out.println("Delivery interrupted for order " + order.getId());
            return;
        }

        long endMillis = System.currentTimeMillis();
        long totalTimeTaken = endMillis - startMillis;

        System.out.printf("[%s] Agent: %s | Priority: %d | Order %d: Delivered | Total Delivery Time: %d ms%n",
                LocalTime.now().format(FORMATTER),
                Thread.currentThread().getName(),
                Thread.currentThread().getPriority(),
                order.getId(),
                totalTimeTaken);
    }
}
