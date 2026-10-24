
package Constructors.Level3;

import java.util.Scanner;

/*
Problem 3: Bank Account Management

Create a BankAccount class with:
accountNumber (public).
accountHolder (protected).
balance (private).

Write methods to:
Access and modify balance using public methods.
Create a subclass SavingsAccount to demonstrate
access to accountNumber and accountHolder.
*/

public class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    // Parameterized constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
            System.out.println("Invalid balance. Initializing balance to zero.");
        }
    }

    // Getter to access private balance
    public double getBalance() {
        return balance;
    }

    // Setter to modify private balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Method to display bank account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs. " + getBalance());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder name: ");
        String accountHolder = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        // Create BankAccount object
        BankAccount account =
                new BankAccount(accountNumber, accountHolder, balance);

        System.out.println("\nBank Account Details:");
        account.displayAccountDetails();

        // Modify balance
        System.out.print("\nEnter updated balance: ");
        double updatedBalance = sc.nextDouble();

        account.setBalance(updatedBalance);

        System.out.println("\nUpdated Bank Account Details:");
        account.displayAccountDetails();

        // Create SavingsAccount object
        SavingsAccount savings =
                new SavingsAccount(102, "Rahul", 15000.0);

        System.out.println("\nSavings Account Details:");
        savings.displaySavingsAccountDetails();

        sc.close();
    }
}

// Subclass to demonstrate access modifiers
class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber, String accountHolder,
                          double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displaySavingsAccountDetails() {
        // Public member: directly accessible
        System.out.println("Account Number: " + accountNumber);

        // Protected member: accessible in subclass
        System.out.println("Account Holder: " + accountHolder);

        // Private member: accessed through public getter
        System.out.println("Balance: Rs. " + getBalance());
    }
}

