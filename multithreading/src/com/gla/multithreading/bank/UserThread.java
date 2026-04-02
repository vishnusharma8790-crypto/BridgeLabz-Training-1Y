package com.gla.multithreading.bank;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class UserThread implements Runnable {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");
    private final BankAccount bankAccount;

    public UserThread(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        for (int check = 1; check <= 3; check++) {
            System.out.printf(
                    "[%s] User Name: %s | Account Type: %s | Thread: %s | Priority: %d | Activity: Checking Balance (%d/3)%n",
                    LocalTime.now().format(FORMATTER),
                    bankAccount.getAccountHolderName(),
                    bankAccount.getAccountType(),
                    Thread.currentThread().getName(),
                    Thread.currentThread().getPriority(),
                    check
            );

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted for user: " + bankAccount.getAccountHolderName());
                return;
            }
        }
    }
}
