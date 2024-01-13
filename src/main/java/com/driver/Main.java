package com.driver;

public class Main {
    public static void main(String[] args) {
        try {
            // Creating and using a SavingsAccount
            SavingsAccount savingsAccount = new SavingsAccount("Alice", 15000, 10000, 0.03);
            savingsAccount.deposit(2000);
            savingsAccount.withdraw(5000);
            System.out.println("Savings Account Balance: " + savingsAccount.balance);
            double simpleInterest = savingsAccount.getSimpleInterest(5);
            System.out.println("Simple Interest for 5 years: " + simpleInterest);
            double compoundInterest = savingsAccount.getCompoundInterest(4, 5);
            System.out.println("Compound Interest for 5 years, compounded 4 times annually: " + compoundInterest);

            // Creating and using a StudentAccount
            StudentAccount studentAccount = new StudentAccount("Bob", 500, "University of XYZ");
            studentAccount.deposit(300);
            studentAccount.withdraw(200);
            System.out.println("Student Account Balance: " + studentAccount.balance);
            System.out.println("Student Account Institution: " + studentAccount.institutionName);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
