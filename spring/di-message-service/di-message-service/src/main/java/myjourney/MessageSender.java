package myjourney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // This is also a bean that Spring needs to manage
public class MessageSender {

  // The dependency is a private, final field
  private final MessageService messageService;

  // CONSTRUCTOR INJECTION
  // Spring will see this constructor and know it needs to find a bean of type
  // MessageService to pass in here when it creates the MessageSender.
  @Autowired // @Autowired on a constructor tells Spring "use this constructor for DI"
  public MessageSender(MessageService messageService) {
    this.messageService = messageService;
  }

  public void send(String message) {
    // We use the dependency that Spring injected
    this.messageService.sendMessage(message);
  }
}