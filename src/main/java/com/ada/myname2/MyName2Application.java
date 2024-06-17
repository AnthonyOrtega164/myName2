package com.ada.myname2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MyName2Application {

    public static void main(String[] args) {
        SpringApplication.run(MyName2Application.class, args);
    }
    @RestController
    class NameController {

        @GetMapping("/name")
        public String getName() {
            return "AnthonyDOM164 - Anthony Ortega";
        }
    }
}
