package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException; // This is a built-in CHECKED exception.
import java.util.HashMap;
import java.util.Map;

public class ConfigReader {

  /**
   * Reads a config file and returns a Map of key-value pairs.
   * 
   * @param filePath The path to the configuration file.
   * @return A Map containing the configuration.
   * @throws IOException               If the file cannot be read (e.g., it
   *                                   doesn't exist).
   * @throws MissingConfigKeyException If a required key is not in the file.
   */
  public Map<String, String> loadConfig(String filePath) throws IOException, MissingConfigKeyException {
    Map<String, String> configMap = new HashMap<>();

    // This is a "try-with-resources" block. It automatically closes the file reader
    // for us, which is a best practice.
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
      String line;
      while ((line = reader.readLine()) != null) {
        // Ignore comments and empty lines
        if (line.startsWith("#") || line.trim().isEmpty()) {
          continue;
        }

        String[] parts = line.split("=", 2);
        if (parts.length != 2) {
          // This is an UNCHECKED exception. It indicates a malformed line,
          // which is a data/programming error. The compiler does not force
          // us to catch this.
          throw new IllegalArgumentException("Invalid config line: " + line);
        }
        configMap.put(parts[0].trim(), parts[1].trim());
      }
    }

    // After reading the file, check for required keys.
    if (!configMap.containsKey("PASSWORD")) {
      // This is our custom CHECKED exception. We are throwing it because a
      // business rule was violated.
      throw new MissingConfigKeyException("Required key 'PASSWORD' is missing from the config file.");
    }

    return configMap;
  }
}
