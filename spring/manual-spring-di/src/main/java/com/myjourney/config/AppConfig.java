package com.myjourney.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
// This scan is crucial. It tells Spring to look in these packages
// for classes annotated with @Controller, @Service, etc.
@ComponentScan(basePackages = { "com.myjourney.controller", "com.myjourney.service" })
public class AppConfig {
}