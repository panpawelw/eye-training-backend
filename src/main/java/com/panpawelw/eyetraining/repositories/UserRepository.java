package com.panpawelw.eyetraining.repositories;

import com.panpawelw.eyetraining.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findUserByName(String name);
  Optional<User> findUserByEmail(String email);

}
