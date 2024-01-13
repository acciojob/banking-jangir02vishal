package com.driver;

public class SavingsAccount extends BankAccount {
    private double rate;
    private double maxWithdrawalLimit;

    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {
        super(name, balance, 0);
        this.rate = rate;
        this.maxWithdrawalLimit = maxWithdrawalLimit;
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if (amount > maxWithdrawalLimit) {
            throw new Exception("Maximum Withdraw Limit Exceed");
        }
        super.withdraw(amount);
    }

    public double getSimpleInterest(int years) {
        return balance * (1 + rate * years);
    }

    public double getCompoundInterest(int times, int years) {
        return balance * Math.pow(1 + rate / times, times * years);
    }
}
