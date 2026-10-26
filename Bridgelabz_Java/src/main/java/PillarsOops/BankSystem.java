package PillarsOops;

/*
Description: Create a banking system with different account types:
- Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
- Add concrete methods deposit(double amount) and withdraw(double amount), and an abstract method calculateInterest().
- Create subclasses SavingsAccount and CurrentAccount with different interest calculations.
- Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
- Use encapsulation to secure account details and restrict unauthorized access.
- Demonstrate polymorphism by processing different account types and calculating interest dynamically.
*/

import java.util.ArrayList;

interface Loanable {
    void applyForLoan(double amount);

    boolean calculateLoanEligibility(double amount);
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
    }
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;
    private double loanLimit;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
        this.interestRate = 0.04;
        this.loanLimit = 50000;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public boolean calculateLoanEligibility(double amount) {
        return amount > 0 && amount <= loanLimit && getBalance() >= amount * 0.2;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility(amount)) {
            System.out.println("Savings account loan approved.");
        } else {
            System.out.println("Savings account loan not approved.");
        }
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate;
    private double loanLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
        this.interestRate = 0.02;
        this.loanLimit = 100000;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public boolean calculateLoanEligibility(double amount) {
        return amount > 0 && amount <= loanLimit && getBalance() >= amount * 0.1;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility(amount)) {
            System.out.println("Current account loan approved.");
        } else {
            System.out.println("Current account loan not approved.");
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SB101", "Aarav", 100000));
        accounts.add(new CurrentAccount("CA202", "Priya", 200000));

        for (BankAccount account : accounts) {
            account.displayDetails();

            account.deposit(5000);
            account.withdraw(2000);

            System.out.println("Updated Balance: " + account.getBalance());
            System.out.println("Interest: " + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                loanable.applyForLoan(30000);
            }

            System.out.println("----------------------");
        }
    }
}