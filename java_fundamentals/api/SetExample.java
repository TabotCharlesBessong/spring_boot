package api;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
  public static void main(String[] args) {
    Set<String> uniqueTags = new HashSet<>();

    uniqueTags.add("typescript");
    uniqueTags.add("react");
    uniqueTags.add("java");

    // Try to add a duplicate. The .add() method will return false,
    // and the set will not be changed. No error is thrown.
    boolean added = uniqueTags.add("java");

    System.out.println("Was 'java' added again? " + added); // false
    System.out.println("The set of tags: " + uniqueTags); // order not guaranteed

    // The most common use case: checking for existence
    boolean hasReact = uniqueTags.contains("react"); // very fast!
    System.out.println("Does the set contain 'react'? " + hasReact); // true
  }
}
