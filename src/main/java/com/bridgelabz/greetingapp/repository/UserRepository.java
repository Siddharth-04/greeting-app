package com.bridgelabz.greetingapp.repository;

import com.bridgelabz.greetingapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
