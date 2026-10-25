package Inheritance.Hierarchical;
/*
Problem: Bank Account Types

Description:
Model a banking system using hierarchical inheritance.
BankAccount is the superclass, and SavingsAccount,
CheckingAccount, and FixedDepositAccount are subclasses.

Tasks:
1. Create a BankAccount class with accountNumber and balance.
2. Create three subclasses with their own unique attributes.
3. Implement displayAccountType() in each subclass.
*/

class BankAccount {
    protected String accountNumber;
    protected double balance;

    // Constructor to initialize common account details
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display common account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs. " + balance);
    }

    // Common method inherited by all account types
    public void displayAccountType() {
        System.out.println("Account Type: General Bank Account");
    }
}

// SavingsAccount inherits from BankAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor initializes superclass and subclass attributes
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Overriding the method to display the specific account type
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// CheckingAccount inherits from BankAccount
class CheckingAccount extends BankAccount {
    private int withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        super.displayDetails();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

// FixedDepositAccount inherits from BankAccount
class FixedDepositAccount extends BankAccount {
    private int depositPeriod;
    private double interestRate;

    public FixedDepositAccount(String accountNumber, double balance, int depositPeriod, double interestRate) {
        super(accountNumber, balance);
        this.depositPeriod = depositPeriod;
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        super.displayDetails();
        System.out.println("Deposit Period: " + depositPeriod + " months");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {

        // Parent-class references hold different subclass objects
        BankAccount savings = new SavingsAccount("SA101", 25000, 4.5);
        BankAccount checking = new CheckingAccount("CA102", 15000, 5000);
        BankAccount fixedDeposit = new FixedDepositAccount("FD103", 100000, 12, 7.0);

        // Calls the overridden method of each actual object
        savings.displayAccountType();
        System.out.println();

        checking.displayAccountType();
        System.out.println();

        fixedDeposit.displayAccountType();
    }
}
