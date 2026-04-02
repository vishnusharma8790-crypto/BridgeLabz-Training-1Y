package com.gla.multithreading.fooddelivery;

public class Order {
    private final int id;
    private final String restaurant;
    private final int deliveryTimeInSeconds;
    private final String type;

    public Order(int id, String restaurant, int deliveryTimeInSeconds, String type) {
        this.id = id;
        this.restaurant = restaurant;
        this.deliveryTimeInSeconds = deliveryTimeInSeconds;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public int getDeliveryTimeInSeconds() {
        return deliveryTimeInSeconds;
    }

    public String getType() {
        return type;
    }
}
