package com.example.HelloworldSpringApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldSpringApp {

    @GetMapping("/helloWorld")
    public String hello(){
     return "Hello from BridgeLabz";
    }
}
