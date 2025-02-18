package com.jake.demo.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.jake.demo.dto.Greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")

public class GreetingController {

    @GetMapping("/greeting/{name}/{id}")
    public Greeting getGreetingData(@PathVariable String name, @PathVariable Long id) {
        return new Greeting(id, name);
    }

    @GetMapping("/greeting")
    public String getGreeting() {
        return "Hello";
    }

    @GetMapping("/greeting/{name}")
    public String getGreetingUser(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/goodbye")
    public String getGoodbye() {
        return "Goodbye";
    }

    @GetMapping("/goodbye/{name}")
    public String getGoodbyeUser(@PathVariable String name) {
        return "Goodbye " + name;
    }
}
