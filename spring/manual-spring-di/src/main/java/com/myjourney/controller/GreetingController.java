package com.myjourney.controller;

import com.myjourney.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Map;

@Controller
public class GreetingController {
  private final GreetingService greetingService;

  @Autowired
  public GreetingController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  @GetMapping("/greet")
  @ResponseBody
  public Map<String, String> greetUser(@RequestParam(defaultValue = "Guest") String name) {
    String message = greetingService.getGreeting(name);
    return Map.of("greeting", message);
  }
}