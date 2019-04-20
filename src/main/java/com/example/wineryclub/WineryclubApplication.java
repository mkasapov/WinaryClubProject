package com.example.wineryclub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WineryclubApplication {

    public static void main(String[] args) {
        SpringApplication.run(WineryclubApplication.class, args);
    }

}
