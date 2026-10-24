
package AggregationAssociationComposition.Level1;

import java.util.ArrayList;
import java.util.Scanner;

/*
Problem 2: Bank and Account Holders (Association)

Description:
Model a relationship where a Bank has Customer objects associated
with it. A Customer can have multiple bank accounts, and each
account is linked to a Bank.

Tasks:
1. Define a Bank class and a Customer class.
2. Use an association relationship to show that each customer
   has an account in a bank.
3. Implement openAccount() in the Bank class and viewBalance()
   in the Customer class.

Goal:
Illustrate association by setting up a relationship between
customers and the bank.
*/

// Customer class
class Customer {

    private String customerName;
    private ArrayList<Bank> banks;
    private ArrayList<Double> balances;

    // Constructor
    public Customer(String customerName) {
        this.customerName = customerName;
        this.banks = new ArrayList<>();
        this.balances = new ArrayList<>();
    }

    // Method to associate customer with a bank account
    public void addAccount(Bank bank, double initialBalance) {
        banks.add(bank);
        balances.add(initialBalance);
    }

    // Method to view account balances
    public void viewBalance() {
        System.out.println("\nCustomer Name: " + customerName);

        if (banks.isEmpty()) {
            System.out.println("No bank accounts available.");
            return;
        }

        for (int i = 0; i < banks.size(); i++) {
            System.out.println("Bank: " + banks.get(i).getBankName());
            System.out.printf("Balance: Rs. %.2f%n", balances.get(i));
        }
    }
}

// Bank class
public class Bank {

    private String bankName;
    private ArrayList<Customer> customers;

    // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Method to open an account
    public void openAccount(Customer customer, double initialBalance) {
        customer.addAccount(this, initialBalance);

        if (!customers.contains(customer)) {
            customers.add(customer);
        }

        System.out.println("Account opened successfully at " + bankName);
    }

    // Method to display bank details
    public void displayBankDetails() {
        System.out.println("\nBank Name: " + bankName);
        System.out.println("Total Customers: " + customers.size());
    }

    // Getter for bank name
    public String getBankName() {
        return bankName;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create two banks
        Bank bank1 = new Bank("State Bank");
        Bank bank2 = new Bank("City Bank");

        // Create a customer
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        Customer customer1 = new Customer(name);

        // Open an account in the first bank
        System.out.print("Enter initial balance for State Bank: ");
        double balance1 = sc.nextDouble();

        bank1.openAccount(customer1, balance1);

        // Open an account in the second bank
        System.out.print("Enter initial balance for City Bank: ");
        double balance2 = sc.nextDouble();

        bank2.openAccount(customer1, balance2);

        // Display customer account details
        customer1.viewBalance();

        // Display bank details
        bank1.displayBankDetails();
        bank2.displayBankDetails();

        sc.close();
    }
}
