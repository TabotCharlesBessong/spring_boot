package extra;

import java.util.Optional;

public class OptionalExample {

  // A method that might not find a user
  public static Optional<User> findUserById(String id) {
    if (id.equals("u-123")) {
      // Found the user, wrap it in an Optional
      return Optional.of(new User("Alice", 30, true));
    } else {
      // Did not find the user, return an empty Optional
      return Optional.empty();
    }
  }

  public static void main(String[] args) {
    // --- The WRONG way to use Optional ---
    // Optional<User> userOptional = findUserById("u-456");
    // User user = userOptional.get(); // Throws NoSuchElementException if empty!
    // AVOID .get()!

    // --- The RIGHT ways to use Optional ---
    System.out.println("--- Looking for a user that exists (u-123) ---");
    Optional<User> foundUser = findUserById("u-123");
    // 1. Check for presence and then act
    if (foundUser.isPresent()) {
      System.out.println("Found user: " + foundUser.get().name()); // .get() is ONLY safe inside isPresent()
    }

    // 2. A more fluent way to do the above
    foundUser.ifPresent(user -> System.out.println("Found user (fluent): " + user.name()));

    System.out.println("\n--- Looking for a user that does NOT exist (u-456) ---");
    Optional<User> missingUser = findUserById("u-456");

    // 3. Provide a default value if the optional is empty
    User userOrDefault = missingUser.orElse(new User("Guest", 0, false));
    System.out.println("User or default: " + userOrDefault.name());

    // 4. Throw an exception if the optional is empty (very common in APIs)
    try {
      User user = missingUser.orElseThrow(() -> new RuntimeException("User not found!"));
    } catch (RuntimeException e) {
      System.out.println("Caught expected exception: " + e.getMessage());
    }
  }
}
