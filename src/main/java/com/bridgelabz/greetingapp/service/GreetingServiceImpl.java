package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.model.UserInfo;
import com.bridgelabz.greetingapp.repository.GreetingRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class GreetingServiceImpl implements IGreetingService {
    @Autowired
    GreetingRepsitory greetingRepsitory;

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

    @Override
    public String saveMessage(Greeting greeting) {
        greetingRepsitory.save(greeting);
        return "Message saved";
    }

    @Override
    public String getMessageById(Long id) {
        Optional<Greeting> obj = greetingRepsitory.findById(id);
        if(obj.isPresent()){
            return obj.get().getMessage();
        }

        return "Message not present with this ID";
    }

}
