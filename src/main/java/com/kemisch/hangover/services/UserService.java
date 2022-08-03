package com.kemisch.hangover.services;

import com.kemisch.hangover.domain.User;
import com.kemisch.hangover.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository repository;

    public User save(User user) {
        return repository.save(user);
    }


}
