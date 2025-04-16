package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.model.UserInfo;
import com.bridgelabz.greetingapp.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userinfo")
public class UserController {
    @Autowired
    UserInfoService userInfoService;

    @PostMapping("")
    public String createNewUser(@RequestBody UserInfo user){
        userInfoService.createUser(user);
        return "<h1> + User Created </h1>";
    }

    @GetMapping("/allusers")
    public List<UserInfo> getAllUserInfo(){
        return userInfoService.getUsers();
    }
}
