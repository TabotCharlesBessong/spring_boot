package oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
  public static void main(String[] args) {
    System.out.println("--- Bank Account Management System ---");

    // We can't do this anymore because BankAccount is abstract!
    // BankAccount genericAccount = new BankAccount("G-000", "Generic", 100); //
    // ERROR!

    List<BankAccount> accounts = new ArrayList<>() ;

    // We can only create instances of CONCRETE child classes.
    // SavingsAccount aliceSavings = new SavingsAccount("S-123", "Alice", 1000.00, 0.05);
    // CheckingAccount bobChecking = new CheckingAccount("C-456", "Bob", 200.00, 100.00);

    // Create some accounts and add them to our list
    accounts.add(new SavingsAccount("S-123", "Alice", 1000.00, 0.05));
    accounts.add(new CheckingAccount("C-456", "Bob", 200.00, 100.00));
    accounts.add(new SavingsAccount("S-789", "Charlie", 5000.00, 0.03));

    // System.out.println("\n--- Processing Alice's Account ---");
    // System.out.println("Owner: " + aliceSavings.getOwnerName());
    // System.out.println("Account Number: " + aliceSavings.getAccountNumber());
    // aliceSavings.displayAccountType(); // Calls the method in SavingsAccount
    // aliceSavings.deposit(500);
    // aliceSavings.applyInterest();

    // System.out.println("\n--- Processing Bob's Account ---");
    // System.out.println("Owner: " + bobChecking.getOwnerName());
    // System.out.println("Account Number: " + bobChecking.getAccountNumber());
    // bobChecking.displayAccountType(); // Calls the method in CheckingAccount
    // bobChecking.withdraw(250); // This will use the overdraft
    // bobChecking.withdraw(100); // This should fail

    System.out.println("\n--- Iterating through all accounts in the list ---");
    for (BankAccount account : accounts) {
      System.out.println("------------------------------------");
      System.out.println("Processing Account: " + account.getAccountNumber());
      System.out.println("Owner: " + account.getOwnerName());
      System.out.println("Balance: $" + account.getBalance());
      account.displayAccountType();
    }

    // 2. Using a MAP for fast lookup by account number
    Map<String, BankAccount> accountMap = new HashMap<>();
    for (BankAccount account : accounts) {
      accountMap.put(account.getAccountNumber(), account);
    }

    System.out.println("\n--- Looking up a specific account using the map ---");
    String accountToFind = "C-456";
    BankAccount foundAccount = accountMap.get(accountToFind);

    if (foundAccount != null) {
      System.out.println("Found account for " + foundAccount.getOwnerName());
      foundAccount.deposit(150);
      System.out.println("New balance for " + accountToFind + ": $" + foundAccount.getBalance());
    } else {
      System.out.println("Account " + accountToFind + " not found.");
    }

    System.out.println("\n--- Bank Statistics ---");
    System.out.println("Total accounts created: " + BankAccount.getAccountsCreated());

    // System.out.println("\n--- Final Balances ---");
    // System.out.println("Alice's Final Balance: $" + aliceSavings.getBalance());
    // System.out.println("Bob's Final Balance: $" + bobChecking.getBalance());

    // // --- Using the STATIC method ---
    // // We call this on the CLASS, not an object.
    // System.out.println("\n--- Bank Statistics ---");
    // System.out.println("Total accounts created: " + BankAccount.getAccountsCreated());
  }
}