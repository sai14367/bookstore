package com.bookstore.bookstore.service;

import com.bookstore.bookstore.entity.User;
import com.bookstore.bookstore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    @Autowired
    private PasswordEncoder encoder;

    // REGISTER
    public User register(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }

    // LOGIN
    public Optional<User> login(String email, String password) {

        Optional<User> dbUser = repo.findByEmail(email);

        if (dbUser.isPresent()) {
            if (encoder.matches(password, dbUser.get().getPassword())) {
                return dbUser;
            }
        }

        return Optional.empty();
    }
}
