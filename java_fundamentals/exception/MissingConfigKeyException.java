package exception;

public class MissingConfigKeyException extends Exception {
  public MissingConfigKeyException(String message) {
    super(message);
  }
}
