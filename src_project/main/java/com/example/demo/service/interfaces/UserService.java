package com.example.demo.service.interfaces;

import com.example.demo.model.users.SignInRequest;
import com.example.demo.model.users.SignInResponse;
import com.example.demo.model.users.User;

public interface UserService {

    public User addUser(User user);

    public User signUp(User user);

    public SignInResponse signIn(SignInRequest signInRequest);


}
