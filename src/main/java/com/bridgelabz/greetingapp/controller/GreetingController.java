package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.model.UserInfo;
import com.bridgelabz.greetingapp.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @Autowired
    GreetingServiceImpl greetingService;

    @GetMapping("")
    public String hello(){
        return String.format("<h1> Hello Siddharth </h1>");
    }

    @PostMapping
    public String greetByUserName(@RequestBody UserInfo userInfo){
        return greetingService.greetByUserName(userInfo);
    }

    @PostMapping("/savegreeting")
    public String saveMessage(@RequestBody Greeting greeting){
        return greetingService.saveMessage(greeting);
    }

    @GetMapping("/getmessage/{id}")
    public String getMessage(@PathVariable Long id){
        return greetingService.getMessageById(id);
    }
}