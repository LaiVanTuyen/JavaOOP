package com.ptit.customproperties;

import com.ptit.customproperties.config.ConfigProperties;
import com.ptit.customproperties.exception.UrlAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class CustomPropertiesApplication {
//    @Autowired
//    private ConfigProperties configProperties;
    public static void main(String[] args) {
        SpringApplication.run(CustomPropertiesApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("**  mail properties  **");
//        System.out.println("From: " + configProperties.getFrom());
//        System.out.println("To: " + configProperties.getTo());
//        System.out.println("Default object: " + configProperties.getDefaultObject());
//    }
    @EventListener(classes = ContextRefreshedEvent.class)
    public void listen(){
        //check if url is accessible
        //if ok
        throw new UrlAccessException("http://www.example.com");

    }
}
