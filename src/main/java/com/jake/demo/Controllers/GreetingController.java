package com.jake.demo.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class GreetingController {

    @GetMapping("/greetings")
    public String getMethodName() {
        return "Hello";
    }
}
