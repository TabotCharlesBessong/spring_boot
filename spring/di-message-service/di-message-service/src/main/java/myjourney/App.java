package myjourney;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.myjourney") // Tell Spring where to look for @Components
public class App {
    public static void main(String[] args) {
        // 1. Create the Spring IoC Container (the "kitchen")
        // It scans the package specified by @ComponentScan for our beans.
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

        // 2. Ask the container for a bean of type MessageSender (the "fully prepared
        // meal")
        // We DO NOT use `new MessageSender()`!
        MessageSender sender = context.getBean(MessageSender.class);

        // 3. Use the bean. It's already fully wired with its dependency.
        sender.send("Hello, Dependency Injection!");
    }
}