package com.example.HelloworldSpringApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HelloWorldSpringApp {

    @GetMapping("/helloWorld")
    public String hello(){
        return "Hello from BridgeLabz";
    }

    @GetMapping("/web")
    public String helloWorld(){
        return "first";
    }

    @GetMapping("/web/message")
    public String messsage(Model model){

        model.addAttribute("message","Hello from BridgeLabz");
        return "message";
    }
    

    @GetMapping("/api")
    public String hii() {
        return "Hello from BridgeLabz";
    }

}