package ObjectedOrientedFundamentals.Level2;
/*
Problem Statement: Create a BankAccount class with attributes accountHolder, accountNumber, and balance. Add methods for:
Depositing money.
Withdrawing money (only if sufficient balance exists).
Displaying the current balance.
Explanation: The BankAccount class stores bank account details as attributes. The methods allow interaction with these attributes to modify and view the account's state.

 */

import java.util.Scanner;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // methods for getters and setters
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
            return;
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    // method to deposit money
    public void deposit(double money){
        if(money<=0){
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance=balance+money;
        System.out.println("Amount deposited successfully.");
    }
    //method to withdraw money
    public void withdraw(double money) {
        if (money <= 0) {
            System.out.println("Amount should be positive");
        }
        else if(balance>=money){
            balance-=money;
            System.out.println("Amount withdrawn successfully.");
        }
        else{
            System.out.println("Insufficient balance.");
        }
    }
    //method to display account details and current balance
    public void showDetails() {
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Current Balance: " + getBalance());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account1 = new BankAccount();

        System.out.print("Enter account holder name: ");
        String accountHolder = sc.nextLine();
        account1.setAccountHolder(accountHolder);

        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();
        account1.setAccountNumber(accountNumber);

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();
        account1.setBalance(balance);

        int choice;

        do {
            System.out.println("\n1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Display Account Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account1.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = sc.nextDouble();
                    account1.withdraw(withdrawalAmount);
                    break;

                case 3:
                    account1.showDetails();
                    break;

                case 4:
                    System.out.println("Thank you for using the bank account system.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }

}
