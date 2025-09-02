package api;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
  public static void main(String[] args) {
    // We need two generic types: one for the key, one for the value.
    // Here, the key is a String (product ID) and the value is a Double (price).
    Map<String, Double> productPrices = new HashMap<>();

    // Adding key-value pairs (like obj[key] = value or map.set(key, value))
    productPrices.put("prod-123", 99.99);
    productPrices.put("prod-456", 25.50);
    productPrices.put("prod-789", 199.00);

    // Overwriting a value is just putting it again with the same key
    productPrices.put("prod-123", 95.00);

    System.out.println("The map of prices: " + productPrices);

    // Getting a value by key (like obj[key] or map.get(key))
    Double price = productPrices.get("prod-456");
    System.out.println("The price of prod-456 is: " + price);

    // Looping through the keys (like Object.keys())
    System.out.println("--- Looping through products ---");
    for (String productId : productPrices.keySet()) {
      Double value = productPrices.get(productId);
      System.out.println("Product " + productId + " costs $" + value);
    }
  }
}
