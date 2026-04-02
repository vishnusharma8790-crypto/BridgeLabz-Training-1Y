package com.gla.multithreading.bank;

public class BankAccount {
    private final String accountHolderName;
    private final String accountType;

    public BankAccount(String accountHolderName, String accountType) {
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }
}
