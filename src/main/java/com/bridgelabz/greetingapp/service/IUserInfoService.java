package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.UserInfo;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IUserInfoService {
    void createUser(@RequestBody UserInfo userInfo);

    List<UserInfo> getUsers();
}
