package com.example.demo.service.implementation;

import com.example.demo.model.users.SignInRequest;
import com.example.demo.model.users.SignInResponse;
import com.example.demo.model.users.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User signUp(User user) {
        String password = user.getPassword();
        String encryptedToken = hash(password);
        user.setPassword(encryptedToken);
        userRepository.save(user);
        Query query = new Query();
        query.addCriteria(Criteria.where("properties." + key).is(value));

        List<User> events = mongoTemplate.find(query, User.class);

        return null;
    }

    @Override
    public SignInResponse signIn(SignInRequest signInRequest) {
        SignInResponse signInResponse = new SignInResponse();
        String userName = signInRequest.getUserName();
        String password = signInRequest.getPassword();
        String token = hash(password);

        signInResponse.setUserName(userName);
        signInResponse.setMessage("Authentication Successful");

        return signInResponse;
    }


    String hash(String str){

        return null;
    }


}
