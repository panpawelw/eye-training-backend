package com.panpawelw.eyetraining.repositories;

import com.panpawelw.eyetraining.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findUserByUserName(String userName);
  Optional<User> findUserByEmail(String email);
}
