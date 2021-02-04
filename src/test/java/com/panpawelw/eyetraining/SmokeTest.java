package com.panpawelw.eyetraining;

import com.panpawelw.eyetraining.controllers.HighScoreController;
import com.panpawelw.eyetraining.controllers.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SmokeTest {

  @Autowired
  private UserController userController;

  @Autowired
  private HighScoreController highScoreController;

  @Test
  public void smokeTest() {
    assertThat(userController).isNotNull();
    assertThat(highScoreController).isNotNull();
  }
}
