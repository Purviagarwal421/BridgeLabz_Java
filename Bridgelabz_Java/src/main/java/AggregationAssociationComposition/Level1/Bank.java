package AggregationAssociationComposition.Level1;/*
Description: Model a relationship where a Bank has Customer objects associated with it.
A Customer can have multiple bank accounts, and each account is linked to a Bank.
Tasks:
Define a Bank class and a Customer class.
Use an association relationship to show that each customer has an account in a bank.
Implement methods that enable communication, such as openAccount() in the Bank class and viewBalance() in the Customer class.
Goal: Illustrate association by setting up a relationship between customers and the bank.

*/

import java.util.ArrayList;

class MyBank{
    protected static final String bankName="hdfc";
    protected ArrayList<Customer> customers;

    // Constructor
    public MyBank() {
        this.customers = new ArrayList<>();
    }
    public void openAccount(Customer customer){
        // to see if customer is there or not
        if(!customers.contains(customer)){
            customers.add(customer);
            // to connect customer to this bank
            customer.setBank(this);
            System.out.println("Added sucessfully");
        }
        else{
            System.out.println("Acoount is already there!!");
        }
    }
}
class Customer{
    protected String name;
    private double balance;
    private MyBank bank;

    Customer(String name,double balance){
        this.name=name;
        this.balance=balance;
    }
    // to get connected to bank
    protected void setBank(MyBank bank){
        this.bank=bank;
    }

    void viewBalance( ){
        // to see if bank has customer
        if (bank != null && bank.customers.contains(this)) {
            System.out.println("Bank: " + bank.bankName);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("No account");
        }
    }
}


public class Bank {
    public static void main(String[] args) {
        Customer c1=new Customer("purvi", 10000);
        Customer c2=new Customer("Selena", 3000);

        MyBank b1=new MyBank();
        b1.openAccount(c2);
        b1.openAccount(c1);
        c1.viewBalance();
        c2.viewBalance();


        MyBank b2=new MyBank();
        b2.openAccount(c2);
        b2.openAccount(c2);
        c2.viewBalance();
    }
}
