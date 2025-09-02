package oop;

public class AccountOperations {
  // Any class that implements this interface MUST provide these methods.
  double getBalance();

  void deposit(double amount);

  boolean withdraw(double amount);
}
