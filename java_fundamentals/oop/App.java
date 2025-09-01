// Location: src/main/java/com/myjourney/App.java
package oop;

public class App {
  public static void main(String[] args) {
    System.out.println("--- Welcome to the Simple Banking App ---");

    // Create instances of our account classes
    SavingsAccount mySavings = new SavingsAccount("S-123", "Alice", 1000.00, 0.02);
    CheckingAccount myChecking = new CheckingAccount("C-456", "Bob", 500.00, 1.50);

    // --- Demonstrate Savings Account ---
    System.out.println("\n--- Operating on Savings Account for " + mySavings.getOwnerName() + " ---");
    System.out.println("Initial Balance: $" + mySavings.getBalance());
    mySavings.deposit(250.00);
    mySavings.withdraw(100.00);
    mySavings.applyInterest(); // Calling the method specific to SavingsAccount
    System.out.println("Final Savings Balance: $" + mySavings.getBalance());

    // --- Demonstrate Checking Account ---
    System.out.println("\n--- Operating on Checking Account for " + myChecking.getOwnerName() + " ---");
    System.out.println("Initial Balance: $" + myChecking.getBalance());
    myChecking.deposit(300.00);
    myChecking.withdraw(50.00); // This will invoke the OVERRIDDEN method in CheckingAccount
    myChecking.withdraw(800.00); // This withdrawal should fail due to insufficient funds
    System.out.println("Final Checking Balance: $" + myChecking.getBalance());
  }
}