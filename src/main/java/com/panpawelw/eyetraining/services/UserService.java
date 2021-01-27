package com.panpawelw.eyetraining.services;

import com.panpawelw.eyetraining.entities.User;
import com.panpawelw.eyetraining.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

  private final UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User findUserByUserName(String userName) {
    Optional<User> user = userRepository.findUserByUserName(userName);
    return user.orElse(null);
  }

  public void saveUser(User user) throws DataIntegrityViolationException {
    userRepository.saveAndFlush(user);
  }
}
