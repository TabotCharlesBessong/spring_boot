package oop;

public class BankAccount {
  // 1. Data (Fields) are declared PRIVATE
  // They are "encapsulated" inside this class.
  private String accountNumber;
  private String ownerName;
  private double balance;

  // 2. The Constructor: A special method to create an instance of the class
  public BankAccount(String accountNumber, String ownerName, double initialBalance) {
    this.accountNumber = accountNumber;
    this.ownerName = ownerName;
    this.balance = initialBalance;
  }

  // 3. Public methods (Behaviors) provide controlled access to the data

  // This is a "getter" method - it only reads data
  public double getBalance() {
    return this.balance;
  }

  public String getOwnerName() {
    return this.ownerName;
  }

  // This method modifies the internal state (balance)
  public void deposit(double amount) {
    if (amount > 0) {
      this.balance += amount;
      System.out.println("Deposited: " + amount + ". New balance: " + this.balance);
    } else {
      System.out.println("Deposit amount must be positive.");
    }
  }

  // This method also modifies the state, but with validation logic
  public boolean withdraw(double amount) {
    if (amount > 0 && amount <= this.balance) {
      this.balance -= amount;
      System.out.println("Withdrew: " + amount + ". New balance: " + this.balance);
      return true; // Withdrawal was successful
    } else {
      System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
      return false; // Withdrawal failed
    }
  }
}
