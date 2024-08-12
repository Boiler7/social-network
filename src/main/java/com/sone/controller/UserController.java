package com.sone.controller;

import com.sone.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {

    @PostMapping("register")
    public User createUser() {

        return null;
    }

    @GetMapping("login")
    public String login(@RequestParam String username, @RequestParam String password) {
        return null;
    }

    @GetMapping("{name}")
    public User getUser(@PathVariable String name) {

        return null;
    }

    @PutMapping("{name}/update")
    public User updateUser(@PathVariable String name, @RequestBody User user) {

        return null;
    }

    @DeleteMapping("{name}/delete")
    public void deleteUser(@PathVariable String name) {

    }
}
