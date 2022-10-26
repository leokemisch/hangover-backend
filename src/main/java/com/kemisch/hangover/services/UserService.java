package com.kemisch.hangover.services;

import com.kemisch.hangover.domain.User;
import com.kemisch.hangover.repositories.UserRepository;
import com.kemisch.hangover.services.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public User save(User user) {
        return repository.save(user);
    }

    public User findById(Long id) {
        Optional<User> user = repository.findById(id);

        return user.orElseThrow(() ->
                new NotFoundException("Object not found! Id: " + id + ", type: " + User.class.getName()));
    }
}
