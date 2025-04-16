package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.model.User;
import com.bridgelabz.greetingapp.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class HelloController {
    @Autowired
    private GreetingServiceImpl greetingService;

    @GetMapping("")
    public String greet(@RequestParam String username){
        return greetingService.greet(username);
    }

    @GetMapping("/{user}")
    public String greetUsingPathVariable(@PathVariable String user){
        return greetingService.greet(user);
    }

    @PostMapping("")
    public String greetUsingPathVariable(@RequestBody User user){
        return greetingService.greet(user.getName());
    }
}
