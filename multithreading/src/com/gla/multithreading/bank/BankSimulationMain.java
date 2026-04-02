package com.gla.multithreading.bank;

public class BankSimulationMain {

    public static void main(String[] args) {
        BankAccount premiumUser = new BankAccount("Aarav", "Premium");
        BankAccount regularUser = new BankAccount("Diya", "Regular");
        BankAccount basicUser = new BankAccount("Rohan", "Basic");

        Thread premiumThread = new Thread(new UserThread(premiumUser), "Premium-User-Thread");
        Thread regularThread = new Thread(new UserThread(regularUser), "Regular-User-Thread");
        Thread basicThread = new Thread(new UserThread(basicUser), "Basic-User-Thread");

        premiumThread.setPriority(10);
        regularThread.setPriority(5);
        basicThread.setPriority(1);

        premiumThread.start();
        regularThread.start();
        basicThread.start();

        try {
            premiumThread.join();
            regularThread.join();
            basicThread.join();
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            System.out.println("Bank simulation interrupted.");
        }

        System.out.println("Bank account simulation completed.");
    }
}
