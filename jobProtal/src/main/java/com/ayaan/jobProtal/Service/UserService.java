package com.ayaan.jobProtal.Service;

import com.ayaan.jobProtal.Model.User;
import com.ayaan.jobProtal.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;
    public List<User> getUsers() {
       return repo.findAll();
    }

    public User addUser(User user) {
        repo.save(user);
        return user;
    }

    public User updateUser(Integer id,User user) {
        User updatedUser = repo.findById(id)
                .orElseThrow(()-> new RuntimeException("User not found"));

        updatedUser.setUserName(user.getUserName());
        updatedUser.setEmail(user.getEmail());
        updatedUser.setPassword(user.getPassword());
        updatedUser.setRole(user.getRole());
        repo.save(updatedUser);
        return updatedUser;
    }

    public String deleteUser(Integer id) {
        repo.deleteById(id);
        return " User deleted successfully";
    }
}
