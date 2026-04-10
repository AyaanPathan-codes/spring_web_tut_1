package com.ayaan.jobProtal.Controller;

import com.ayaan.jobProtal.Service.UserService;
import com.ayaan.jobProtal.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
       @Autowired
        private UserService service;
    @GetMapping("/")
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = service.getUsers();
      return ResponseEntity.ok(users);
    }
    @PostMapping("/")
    public ResponseEntity<User> addUser(@RequestBody User user){
       User savedUsers =  service.addUser(user);
        return ResponseEntity.status(201).body(savedUsers);
    }
    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Integer id,@RequestBody User user){
        User updatedUser = service.updateUser(id,user);
        return ResponseEntity.status(200).body(updatedUser);
    }
    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Integer id){
        String delteUser = service.deleteUser(id);
        return ResponseEntity.status(200).body(delteUser);
    }
}
