package com.gla.multithreading.smarthome;

public class SmartHomeAutomationMain {

    public static void main(String[] args) {
        Thread temperatureThread = new Thread(new DeviceTask("Temperature Sensor", 5000, 5), "Temperature-Thread");
        Thread securityThread = new Thread(new DeviceTask("Security Camera", 3000, 5), "Security-Thread");
        Thread lightThread = new Thread(new DeviceTask("Light Controller", 4000, 5), "Light-Thread");
        Thread doorThread = new Thread(new DeviceTask("Door Lock Monitor", 6000, 5), "Door-Thread");

        securityThread.setPriority(10);
        temperatureThread.setPriority(7);
        lightThread.setPriority(5);
        doorThread.setPriority(5);

        temperatureThread.start();
        securityThread.start();
        lightThread.start();
        doorThread.start();

        try {
            temperatureThread.join();
            securityThread.join();
            lightThread.join();
            doorThread.join();
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            System.out.println("Smart home automation interrupted.");
        }

        System.out.println("Smart home automation completed.");
    }
}
