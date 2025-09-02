import syntax.Calculator;

public class intro {
  public static void main(String[] args) {
    // // Primitive Types
    // int userAge = 30;
    // double accountBalance = 150.75;
    // boolean isLoggedIn = true;
    // char initial = 'J';

    // // Reference Type
    // String userName = "John Doe"; // Use double quotes for Strings

    // // You cannot reassign a variable to a different type.
    // // This will cause a compile error:
    // // userAge = "thirty"; // ERROR! Incompatible types.

    // // Printing variables
    // System.out.println("User: " + userName); // String concatenation works like JS
    // System.out.println("Age: " + userAge);
    // System.out.println("Balance: $" + accountBalance);
    // System.out.println("Logged In: " + isLoggedIn);
    // System.out.println("Initial: " + initial);

    int score = 85;
    String grade; // Declare without initializing

    // if-else if-else
    if (score >= 90) {
      grade = "A";
    } else if (score >= 80) {
      grade = "B";
    } else {
      grade = "C";
    }
    System.out.println("Your grade is: " + grade); // Output: Your grade is: B

    // for loop
    System.out.println("Classic for loop:");
    for (int i = 0; i < 3; i++) {
      System.out.println("Count: " + i);
    }

    // for-each loop (like for...of in JS)
    System.out.println("For-each loop:");
    String[] names = { "Alice", "Bob", "Charlie" };
    for (String name : names) {
      System.out.println("Hello, " + name);
    }

    Calculator myCalculator = new Calculator(); // The 'new' keyword creates the object

      // Now we can call the methods on this specific instance
      myCalculator.printWelcomeMessage();

      int sum = myCalculator.add(5, 7);

      System.out.println("The sum is: " + sum); // Output: The sum is: 12
  }
}