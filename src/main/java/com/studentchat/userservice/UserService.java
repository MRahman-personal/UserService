package com.studentchat.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<ChatUser> getAllUsers() {
        return StreamSupport
                .stream(userRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public Optional<ChatUser> getUserById(String id) {
        return userRepository.findById(id);
    }

    public ChatUser saveUser(ChatUser user) {
        return userRepository.save(user);
    }

}
