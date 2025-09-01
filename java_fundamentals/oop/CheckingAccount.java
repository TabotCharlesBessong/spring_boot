package oop;

public class CheckingAccount extends BankAccount {

  private double transactionFee;

  public CheckingAccount(String accountNumber, String ownerName, double initialBalance, double transactionFee) {
    super(accountNumber, ownerName, initialBalance);
    this.transactionFee = transactionFee;
  }

  /**
   * @Override annotation tells the compiler we intend to replace the
   *           parent's version of this method. This helps catch typos.
   */
  @Override
  public boolean withdraw(double amount) {
    // Calculate total amount to be deducted (withdrawal + fee)
    double totalDeduction = amount + this.transactionFee;

    // Check if there are enough funds for both the amount AND the fee
    if (totalDeduction > getBalance()) {
      System.out.println("Withdrawal failed. Insufficient funds for withdrawal + transaction fee.");
      return false;
    }

    // Call the PARENT'S withdraw method using 'super' to handle the main logic.
    // We first withdraw the requested amount.
    boolean success = super.withdraw(amount);

    // If that was successful, we then withdraw the fee.
    if (success) {
      System.out.println("Applying transaction fee of $" + this.transactionFee);
      super.withdraw(this.transactionFee);
    }

    return success;
  }
}