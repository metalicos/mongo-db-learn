package com.mongodb.learn.service;


import com.mongodb.learn.model.Sport;
import com.mongodb.learn.model.User;
import com.mongodb.learn.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersService {
    private final UserRepository userRepository;

    public Optional<User> saveUser(User user) {
        return Optional.of(userRepository.save(user));
    }

    public Optional<User> getUser(int id) {
        return userRepository.findById(id);
    }

    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Optional<User> addSport(int id, Sport sport) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setSport(sport);
                    return user;
                })
                .flatMap(this::saveUser);
    }

    public Optional<List<User>> getBySportname(String sportName) {
        return userRepository.findBySport_SportName(sportName);
    }
}
