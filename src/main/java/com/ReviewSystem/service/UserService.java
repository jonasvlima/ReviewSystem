package com.ReviewSystem.service;


import com.ReviewSystem.model.User;
import com.ReviewSystem.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User saveUser(User user) {
        return this.userRepository.save(user);
    }

    public User getUser(Long id) {
        return this.userRepository.findById(id).orElse(null);
    }

    public Iterable<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    public void deleteUser(Long id) {
        this.userRepository.deleteById(id);
    }
}
