package myjourney;

public class EmailService implements MessageService {
  @Override
  public void sendMessage(String message){
    System.out.println("Sending EMAIL with message: " + message);
  }
}
