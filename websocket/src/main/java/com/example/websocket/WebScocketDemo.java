package com.example.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebScocketDemo {
    public static void main(String[] args) {
        SpringApplication.run(WebScocketDemo.class,args);
        System.out.println("webSocket is success!");
    }
}
