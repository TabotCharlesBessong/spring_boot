package oop;

public class SavingsAccount extends BankAccount {

  private double interestRate;

  // The constructor for the child class
  public SavingsAccount(String accountNumber, String ownerName, double initialBalance, double interestRate) {
    // 'super()' MUST be the first line. It calls the parent's constructor.
    super(accountNumber, ownerName, initialBalance);
    this.interestRate = interestRate;
  }

  // A new method specific to SavingsAccount
  public void applyInterest() {
    double interest = getBalance() * interestRate;
    deposit(interest); // We can call the parent's public methods!
    System.out.println("Applied interest of: " + interest);
  }
}
