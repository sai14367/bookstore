package com.bookstore.bookstore.controller;

import com.bookstore.bookstore.entity.User;
import com.bookstore.bookstore.security.JwtUtil;
import com.bookstore.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private UserService service;

    @Autowired
    private JwtUtil jwt;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return service.register(user);
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody User user) {

        Optional<User> dbUser = service.login(
                user.getEmail(),
                user.getPassword()
        );

        if (dbUser.isEmpty()) {
            throw new RuntimeException("Invalid credentials");
        }

        String token = jwt.generateToken(
                dbUser.get().getEmail(),
                dbUser.get().getRole()
        );

        return Map.of("token", token);
    }
}
