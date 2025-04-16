package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.model.UserInfo;
import org.springframework.web.bind.annotation.RequestBody;

public interface IGreetingService {
    public String greet(String username);
    String greetByUserName(@RequestBody UserInfo userInfo);
    String saveMessage(@RequestBody Greeting greeting);
}
