package com.driver;

public class CurrentAccount extends BankAccount {
    private String tradeLicenseId;

    public CurrentAccount(String name, double balance, String tradeLicenseId) throws Exception {
        super(name, balance, 5000);
        if (balance < 5000) {
            throw new Exception("Insufficient Balance");
        }
        this.tradeLicenseId = tradeLicenseId;
        validateLicenseId();
    }

    public void validateLicenseId() throws Exception {
        // Check if the trade license ID is valid or can be made valid
        // This is a complex problem and requires a separate algorithm
        // For simplicity, we'll skip the actual implementation
        throw new Exception("Valid License can not be generated");
    }
}
