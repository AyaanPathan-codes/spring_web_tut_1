package com.ayaan.jobProtal.Repo;

import com.ayaan.jobProtal.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

}
