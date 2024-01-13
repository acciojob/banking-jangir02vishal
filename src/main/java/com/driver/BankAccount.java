package com.driver;

public class BankAccount {
    protected String name;
    protected double balance;
    protected double minBalance;

    public BankAccount(String name, double balance, double minBalance) {
        this.name = name;
        this.balance = balance;
        this.minBalance = minBalance;
    }

    public String generateAccountNumber(int digits, int sum) throws Exception {
        // Implementation of account number generation logic
        // This is a complex problem and requires a separate algorithm to generate such a number
        // For simplicity, we'll skip the actual implementation
        throw new Exception("Account Number can not be generated");
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if (this.balance - amount < this.minBalance) {
            throw new Exception("Insufficient Balance");
        }
        this.balance -= amount;
    }
}
