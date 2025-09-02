package exception;

import java.io.IOException;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    ConfigReader reader = new ConfigReader();

    // --- Scenario 1: The file is present, but a key is missing ---
    System.out.println("--- Attempting to read 'config.txt' (missing a key) ---");
    try {
      Map<String, String> config = reader.loadConfig("config.txt");
      System.out.println("Configuration loaded successfully!"); // This line won't be reached
      System.out.println("Host: " + config.get("HOST"));
    } catch (MissingConfigKeyException e) {
      // We caught our custom, specific business error!
      System.out.println("Error: " + e.getMessage());
    } catch (IOException e) {
      // This would catch errors like file not found, permission denied, etc.
      System.out.println("Error reading file: " + e.getMessage());
    }

    System.out.println("\n------------------------------------------------\n");

    // --- Scenario 2: The file does not exist ---
    System.out.println("--- Attempting to read 'non_existent_file.txt' ---");
    try {
      Map<String, String> config = reader.loadConfig("non_existent_file.txt");
      System.out.println("Configuration loaded successfully!");
    } catch (MissingConfigKeyException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (IOException e) {
      // This is the block that will execute in this scenario!
      System.out.println("Error reading file: " + e.getMessage());
    } finally {
      // The 'finally' block always runs, for cleanup.
      System.out.println("Configuration loading attempt finished.");
    }
  }
}
