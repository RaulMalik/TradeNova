package com.tradenova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(App.class);
        app.setBanner((environment, sourceClass, out) ->
                out.println("TradeNova up!"));
        app.run(args);
    }
}