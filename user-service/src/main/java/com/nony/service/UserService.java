package com.nony.service;

import com.nony.model.User;
import com.nony.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
