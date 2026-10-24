package StaticThisFinal.Level1;
/*
Create a BankAccount class with the following features:
Static:
A static variable bankName shared across all accounts.
A static method getTotalAccounts() to display the total number of accounts.
This:
Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
Final:
Use a final variable accountNumber to ensure it cannot be changed once assigned.
Instanceof:
Check if an account object is an instance of the BankAccount class before displaying its details.

 */

public class BankAccount {
    private String name;
    private double balance;
    private static String bankName="Canara Bank";
    private static int totalAccounts=0;
    private final int accountNumber;

    // parameterized constructor
    public BankAccount(String name,double balance,int accountNumber){
        this.name=name;
        if(balance>=0){
            this.balance=balance;
        }
        else{
            this.balance=0;
        }
        this.accountNumber=accountNumber;
        totalAccounts++;
    }
    // static method to define the bankName
    public static int getTotalAccounts(){
        return totalAccounts;
    }
    // Static method to get bank name
    public static String getBankName() {
        return bankName;
    }
    // Static method to update bank name
    public static void setBankName(String bankName) {
        BankAccount.bankName = bankName;
    }
    // Method to display account details
    public void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs. " + balance);
    }
    public static void main(String[] args) {
        // Create account objects
        BankAccount account1 = new BankAccount("Rahul", 15000.0, 101);

        BankAccount account2 = new BankAccount("Priya", 25000.0, 102);

        // instanceof check
        Object obj = account1;

        if (obj instanceof BankAccount) {
            System.out.println("Object is a BankAccount.");
            account1.displayDetails();
        } else {
            System.out.println("Object is not a BankAccount.");
        }

        System.out.println("\nSecond Account:");
        account2.displayDetails();

        // Update shared bank name
        BankAccount.setBankName("State Bank of India");

        System.out.println("\nAfter updating bank name:");
        account1.displayDetails();
        account2.displayDetails();

        // Display total number of accounts
        System.out.println("\nTotal Accounts: " + BankAccount.getTotalAccounts());
    }
}