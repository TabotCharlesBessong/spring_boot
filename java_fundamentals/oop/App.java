// Location: src/main/java/com/myjourney/App.java
package oop;

public class App {
  public static void main(String[] args) {
    System.out.println("--- Bank Account Management System ---");

    // We can't do this anymore because BankAccount is abstract!
    // BankAccount genericAccount = new BankAccount("G-000", "Generic", 100); //
    // ERROR!

    // We can only create instances of CONCRETE child classes.
    SavingsAccount aliceSavings = new SavingsAccount("S-123", "Alice", 1000.00, 0.05);
    CheckingAccount bobChecking = new CheckingAccount("C-456", "Bob", 200.00, 100.00);

    System.out.println("\n--- Processing Alice's Account ---");
    System.out.println("Owner: " + aliceSavings.getOwnerName());
    System.out.println("Account Number: " + aliceSavings.getAccountNumber());
    aliceSavings.displayAccountType(); // Calls the method in SavingsAccount
    aliceSavings.deposit(500);
    aliceSavings.applyInterest();

    System.out.println("\n--- Processing Bob's Account ---");
    System.out.println("Owner: " + bobChecking.getOwnerName());
    System.out.println("Account Number: " + bobChecking.getAccountNumber());
    bobChecking.displayAccountType(); // Calls the method in CheckingAccount
    bobChecking.withdraw(250); // This will use the overdraft
    bobChecking.withdraw(100); // This should fail

    System.out.println("\n--- Final Balances ---");
    System.out.println("Alice's Final Balance: $" + aliceSavings.getBalance());
    System.out.println("Bob's Final Balance: $" + bobChecking.getBalance());

    // --- Using the STATIC method ---
    // We call this on the CLASS, not an object.
    System.out.println("\n--- Bank Statistics ---");
    System.out.println("Total accounts created: " + BankAccount.getAccountsCreated());
  }
}