package com.jake.demo.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("/api")

public class GreetingController {

    @GetMapping("/greeting")
    @ResponseBody
    public String getGreeting() {
        return "Hello";
    }

    @GetMapping("/greeting/{name}")
    @ResponseBody
    public String getGreetingUser(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/goodbye")
    @ResponseBody
    public String getGoodbye() {
        return "Goodbye";
    }

    @GetMapping("/goodbye/{name}")
    @ResponseBody
    public String getGoodbyeUser(@PathVariable String name) {
        return "Goodbye " + name;
    }
}
