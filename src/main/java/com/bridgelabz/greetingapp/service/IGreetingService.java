package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.model.UserInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IGreetingService {
    public String greet(String username);
    String greetByUserName(@RequestBody UserInfo userInfo);
    String saveMessage(@RequestBody Greeting greeting);
    String getMessageById(@PathVariable Long id);
    List<Greeting> getAllMessages();
    String updateMessage(@PathVariable Long id,@RequestBody Greeting greet);
    String deleteMessageById(@PathVariable Long id);
}