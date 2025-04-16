package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.UserInfo;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements IGreetingService {
    @Override
    public String greet(String username){
        return "Hello " + username;
    }

    @Override
    public String greetByUserName(UserInfo userInfo) {
        String firstName = userInfo.getFirstName();
        String lastName = userInfo.getLastName();
        String toReturn = "Hello " + firstName + " " + lastName + " !";
        return toReturn;
    }


}
