package com.myjourney.service;

import org.springframework.stereotype.Service;
import java.time.LocalTime;

@Service
public class GreetingServiceImpl implements GreetingService {
  @Override
  public String getGreeting(String name) {
    int currentHour = LocalTime.now().getHour();
    if (currentHour < 12)
      return "Good morning, " + name + "!";
    if (currentHour < 18)
      return "Good afternoon, " + name + "!";
    return "Good evening, " + name + "!";
  }
}