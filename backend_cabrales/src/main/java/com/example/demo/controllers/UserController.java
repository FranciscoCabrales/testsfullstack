package com.example.demo.controllers;

import com.example.demo.services.UserService;
import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<UserModel> getUsers() {

        return userService.getUsers();
    }

    @PostMapping()
    public UserModel saveUser(@RequestBody UserModel user) {
        return userService.saveUser(user);
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/query")
    public ArrayList<UserModel> getUsersByName(@RequestParam("name") String name) {
        return userService.getUsersByName(name);
    }

    // @PutMapping(path = {"/{id}"})
    // public UserModel editar()
    // }
   

    @DeleteMapping(path = "/{id}")
    public String deleteUserById(@PathVariable("id") Long id) {

        boolean ok = userService.deleteUser(id);
        if (ok) {
            return "Delete user by id" + id;
        } else {
            return "Error Delete user by id" + id;
        }

    }
}
