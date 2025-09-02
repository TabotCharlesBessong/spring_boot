package api;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
  public static void main(String[] args) {
    // We use "Generics" (<String>) to tell the list it will only hold Strings.
    // This gives us type safety! The compiler won't let you add an integer.
    // The syntax is: Interface<Type> variableName = new Implementation<>();
    List<String> names = new ArrayList<>();

    // Adding elements (like Array.push())
    names.add("Alex");
    names.add("Bob");
    names.add("Charlie");
    names.add("Alice"); // Duplicates are fine!

    System.out.println("The list: " + names);

    // Getting an element by index (like array[i])
    String secondName = names.get(1); // 0-based index
    System.out.println("The second name is: " + secondName);

    // Getting the size (like array.length)
    System.out.println("Number of names: " + names.size());

    // Looping through the list (like for...of)
    System.out.println("--- Looping ---");
    for (String name : names) {
      System.out.println("Hello, " + name);
    }

    names.remove("Alice"); // Removes the first "Alice"
    System.out.println("After removing Alice: " + names);
  }
}
