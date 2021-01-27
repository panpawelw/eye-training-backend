package com.panpawelw.eyetraining.controllers;

import com.panpawelw.eyetraining.entities.User;
import com.panpawelw.eyetraining.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/login")
  public void login(User user) {}

  @GetMapping("/logout")
  public void logout() {}

  @PostMapping("/register")
  public void register(User user) {}
}
