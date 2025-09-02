package extra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

record User(String name, int age, boolean isActive) {
}

public class StreamsExample {
  public static void main(String[] args) {
    List<User> users = List.of( // A convenient way to create an immutable list
        new User("Alice", 30, true),
        new User("Bob", 22, true),
        new User("Charlie", 35, false),
        new User("David", 28, true),
        new User("Eve", 22, false));

    // --- The OLD WAY (Imperative loop) ---
    List<String> activeUserNamesOld = new ArrayList<>();
    for (User user : users) {
      if (user.isActive() && user.age() > 25) {
        activeUserNamesOld.add(user.name());
      }
    }
    Collections.sort(activeUserNamesOld);
    System.out.println("Old way result: " + activeUserNamesOld);

    // --- The NEW WAY (Declarative Stream) ---
    List<String> activeUserNamesNew = users.stream() // 1. Get the stream
        .filter(user -> user.isActive()) // 2. Intermediate Op: filter for active
        .filter(user -> user.age() > 25) // 3. Intermediate Op: filter for age
        .map(user -> user.name()) // 4. Intermediate Op: transform User to String (name)
        .sorted() // 5. Intermediate Op: sort the names
        .collect(Collectors.toList()); // 6. Terminal Op: collect into a new List

    System.out.println("New way result: " + activeUserNamesNew);
  }
}
