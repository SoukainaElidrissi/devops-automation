package com.example.processus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProcessusApplication {
   @GetMapping()
    public String message(){return "this is ur first pipeline congrats";}

    public static void main(String[] args) {
        SpringApplication.run(ProcessusApplication.class, args);
    }

}
